package net.bootsfaces.component.colorPicker;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import javax.faces.component.FacesComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;

import net.bootsfaces.C;
import net.bootsfaces.beans.ELTools;
import net.bootsfaces.component.ajax.IAJAXComponent;
import net.bootsfaces.listeners.AddResourcesListener;
import net.bootsfaces.render.IHasTooltip;
import net.bootsfaces.render.Tooltip;

@FacesComponent("net.bootsfaces.component.colorPicker.ColorPicker")
public class ColorPicker extends HtmlInputText implements IHasTooltip, IAJAXComponent {

	private String renderLabel = null;

	/**
	 * <p>
	 * The standard component type for this component.
	 * </p>
	 */
	public static final String COMPONENT_TYPE = C.BSFCOMPONENT + ".ColorPicker";
	/**
	 * <p>
	 * The component family for this component.
	 * </p>
	 */
	public static final String COMPONENT_FAMILY = C.BSFCOMPONENT;

	private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(
			Arrays.asList("blur", "change", "valueChange", "click", "dblclick", "focus", "keydown", "keypress", "keyup",
					"mousedown", "mousemove", "mouseout", "mouseover", "mouseup", "select"));

	public ColorPicker() {
		setRendererType("net.bootsfaces.component.colorPicker.ColorPicker");
		Tooltip.addResourceFiles();
		AddResourcesListener.addThemedCSSResource("bsf.css");
		AddResourcesListener.addThemedCSSResource("jquery.minicolors.css");
		AddResourcesListener.addThemedCSSResource("core.css");
		AddResourcesListener.addResourceToHeadButAfterJQuery(C.BSF_LIBRARY, "js/jquery.minicolors.min.js");

		renderLabel = FacesContext.getCurrentInstance().getExternalContext()
				.getInitParameter("net.bootsfaces.defaults.renderLabel");
		if (null != renderLabel && renderLabel.contains("#{")) {
			renderLabel = ELTools.evalAsString(renderLabel);
		}
	}

	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	/**
	 * returns the subset of AJAX requests that are implemented by jQuery
	 * callback or other non-standard means (such as the onclick event of
	 * b:tabView, which has to be implemented manually).
	 *
	 * @return
	 */
	public Map<String, String> getJQueryEvents() {
		return null;
	}

	public Collection<String> getEventNames() {
		return EVENT_NAMES;
	}

	public String getDefaultEventName() {
		return "valueChange";
	}

	/**
	 * Component(s) to be updated with ajax.
	 * <P>
	 *
	 * @return Returns the value of the attribute, or null, if it hasn't been
	 *         set by the JSF file.
	 */
	public String getSwatches() {
		String value = (String) getStateHelper().eval("swatches");
		return value;
	}

	/**
	 * Component(s) to be updated with ajax.
	 * <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setSwatches(String _swatches) {
		getStateHelper().put("swatches", _swatches);
	}

	protected enum PropertyKeys {
		accesskey,
		ajax,
		alt,
		autocomplete,
		binding,
		converterMessage,
		control,
		format,
		opacity,
		position,
		dir,
		disabled,
		fieldSize,
		immediate,
		inline,
		label,
		lang,
		onblur,
		onchange,
		onclick,
		oncomplete,
		ondblclick,
		onfocus,
		onkeydown,
		onkeypress,
		onkeyup,
		onmousedown,
		onmousemove,
		onmouseout,
		onmouseover,
		onmouseup,
		onselect,
		placeholder,
		process,
		readonly,
		renderLabel,
		required,
		requiredMessage,
		size,
		span,
		style,
		styleClass,
		tabindex,
		title,
		tooltip,
		tooltipContainer,
		tooltipDelay,
		tooltipDelayHide,
		tooltipDelayShow,
		tooltipPosition,
		type,
		update
;
        String toString;

        PropertyKeys(String toString) {
            this.toString = toString;
        }

        PropertyKeys() {}

        public String toString() {
            return ((this.toString != null) ? this.toString : super.toString());
        }
    }
	

	/**
	 * Access key to transfer focus to the input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getAccesskey() {
		return  (String)getStateHelper().eval(PropertyKeys.accesskey);
	}
	
	/**
	 * Access key to transfer focus to the input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setAccesskey(String _accesskey) {
	    getStateHelper().put(PropertyKeys.accesskey, _accesskey);
    }
	

	/**
	 * Activates AJAX. The default value is false (no AJAX). <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isAjax() {
		return (boolean) (Boolean)getStateHelper().eval(PropertyKeys.ajax, false);
	}
	
	/**
	 * Activates AJAX. The default value is false (no AJAX). <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setAjax(boolean _ajax) {
	    getStateHelper().put(PropertyKeys.ajax, _ajax);
    }
	

	/**
	 * Alternate textual description of the input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getAlt() {
		return  (String)getStateHelper().eval(PropertyKeys.alt);
	}
	
	/**
	 * Alternate textual description of the input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setAlt(String _alt) {
	    getStateHelper().put(PropertyKeys.alt, _alt);
    }
	

	/**
	 * Controls browser autocomplete behavior. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getAutocomplete() {
		return  (String)getStateHelper().eval(PropertyKeys.autocomplete);
	}
	
	/**
	 * Controls browser autocomplete behavior. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setAutocomplete(String _autocomplete) {
	    getStateHelper().put(PropertyKeys.autocomplete, _autocomplete);
    }
	

	/**
	 * An EL expression referring to a server side UIComponent instance in a backing bean. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public javax.faces.component.UIComponent getBinding() {
		return  (javax.faces.component.UIComponent)getStateHelper().eval(PropertyKeys.binding);
	}
	
	/**
	 * An EL expression referring to a server side UIComponent instance in a backing bean. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setBinding(javax.faces.component.UIComponent _binding) {
	    getStateHelper().put(PropertyKeys.binding, _binding);
    }
	

	/**
	 * Message to display when conversion fails. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getConverterMessage() {
		return  (String)getStateHelper().eval(PropertyKeys.converterMessage);
	}
	
	/**
	 * Message to display when conversion fails. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setConverterMessage(String _converterMessage) {
	    getStateHelper().put(PropertyKeys.converterMessage, _converterMessage);
    }
	

	/**
	 * The type of control to display. Valid values: hue, brightness, saturation, and wheel. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getControl() {
		return  (String)getStateHelper().eval(PropertyKeys.control);
	}
	
	/**
	 * The type of control to display. Valid values: hue, brightness, saturation, and wheel. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setControl(String _control) {
	    getStateHelper().put(PropertyKeys.control, _control);
    }
	

	/**
	 * Type of returned data. Valid values: hex and rgb. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getFormat() {
		return  (String)getStateHelper().eval(PropertyKeys.format);
	}
	
	/**
	 * Type of returned data. Valid values: hex and rgb. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setFormat(String _format) {
	    getStateHelper().put(PropertyKeys.format, _format);
    }
	

	/**
	 * True to enable opacity swatches. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isOpacity() {
		return (boolean) (Boolean)getStateHelper().eval(PropertyKeys.opacity, false);
	}
	
	/**
	 * True to enable opacity swatches. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOpacity(boolean _opacity) {
	    getStateHelper().put(PropertyKeys.opacity, _opacity);
    }
	

	/**
	 * Sets the position of the dropdown. Valid options are bottom left, bottom right, top left, and top right. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getPosition() {
		return  (String)getStateHelper().eval(PropertyKeys.position);
	}
	
	/**
	 * Sets the position of the dropdown. Valid options are bottom left, bottom right, top left, and top right. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setPosition(String _position) {
	    getStateHelper().put(PropertyKeys.position, _position);
    }
	

	/**
	 * Direction indication for text that does not inherit directionality. Legal values: ltr (Default. Left-to-right text direction), rtl (Right-to-left text direction) and auto (let the browser figure out the direction of your alphabet, based on the page content). <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getDir() {
		return  (String)getStateHelper().eval(PropertyKeys.dir);
	}
	
	/**
	 * Direction indication for text that does not inherit directionality. Legal values: ltr (Default. Left-to-right text direction), rtl (Right-to-left text direction) and auto (let the browser figure out the direction of your alphabet, based on the page content). <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setDir(String _dir) {
	    getStateHelper().put(PropertyKeys.dir, _dir);
    }
	

	/**
	 * Disables the input element, default is false. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isDisabled() {
		return (boolean) (Boolean)getStateHelper().eval(PropertyKeys.disabled, false);
	}
	
	/**
	 * Disables the input element, default is false. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setDisabled(boolean _disabled) {
	    getStateHelper().put(PropertyKeys.disabled, _disabled);
    }
	

	/**
	 * The size of the input. Possible values are xs (extra small), sm (small), md (medium) and lg (large) . <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getFieldSize() {
		return  (String)getStateHelper().eval(PropertyKeys.fieldSize);
	}
	
	/**
	 * The size of the input. Possible values are xs (extra small), sm (small), md (medium) and lg (large) . <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setFieldSize(String _fieldSize) {
	    getStateHelper().put(PropertyKeys.fieldSize, _fieldSize);
    }
	

	/**
	 * Flag indicating that, if this component is activated by the user, notifications should be delivered to interested listeners and actions immediately (that is, during Apply Request Values phase) rather than waiting until Invoke Application phase. Default is false. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isImmediate() {
		return (boolean) (Boolean)getStateHelper().eval(PropertyKeys.immediate, false);
	}
	
	/**
	 * Flag indicating that, if this component is activated by the user, notifications should be delivered to interested listeners and actions immediately (that is, during Apply Request Values phase) rather than waiting until Invoke Application phase. Default is false. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setImmediate(boolean _immediate) {
	    getStateHelper().put(PropertyKeys.immediate, _immediate);
    }
	

	/**
	 * Inline forms are more compact and put the label to the left hand side of the input field instead of putting it above the input field. Inline applies only to screens that are at least 768 pixels wide. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isInline() {
		return (boolean) (Boolean)getStateHelper().eval(PropertyKeys.inline, false);
	}
	
	/**
	 * Inline forms are more compact and put the label to the left hand side of the input field instead of putting it above the input field. Inline applies only to screens that are at least 768 pixels wide. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setInline(boolean _inline) {
	    getStateHelper().put(PropertyKeys.inline, _inline);
    }
	

	/**
	 * The label of the field. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getLabel() {
		return  (String)getStateHelper().eval(PropertyKeys.label);
	}
	
	/**
	 * The label of the field. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setLabel(String _label) {
	    getStateHelper().put(PropertyKeys.label, _label);
    }
	

	/**
	 * Code describing the language used in the generated markup for this component. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getLang() {
		return  (String)getStateHelper().eval(PropertyKeys.lang);
	}
	
	/**
	 * Code describing the language used in the generated markup for this component. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setLang(String _lang) {
	    getStateHelper().put(PropertyKeys.lang, _lang);
    }
	

	/**
	 * Client side callback to execute when input element loses focus. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnblur() {
		return  (String)getStateHelper().eval(PropertyKeys.onblur);
	}
	
	/**
	 * Client side callback to execute when input element loses focus. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnblur(String _onblur) {
	    getStateHelper().put(PropertyKeys.onblur, _onblur);
    }
	

	/**
	 * Client side callback to execute when input element loses focus and its value has been modified since gaining focus. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnchange() {
		return  (String)getStateHelper().eval(PropertyKeys.onchange);
	}
	
	/**
	 * Client side callback to execute when input element loses focus and its value has been modified since gaining focus. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnchange(String _onchange) {
	    getStateHelper().put(PropertyKeys.onchange, _onchange);
    }
	

	/**
	 * OnClick DHTML event . <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnclick() {
		return  (String)getStateHelper().eval(PropertyKeys.onclick);
	}
	
	/**
	 * OnClick DHTML event . <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnclick(String _onclick) {
	    getStateHelper().put(PropertyKeys.onclick, _onclick);
    }
	

	/**
	 * JavaScript to be executed when ajax completes with success. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOncomplete() {
		return  (String)getStateHelper().eval(PropertyKeys.oncomplete);
	}
	
	/**
	 * JavaScript to be executed when ajax completes with success. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOncomplete(String _oncomplete) {
	    getStateHelper().put(PropertyKeys.oncomplete, _oncomplete);
    }
	

	/**
	 * Client side callback to execute when input element is double clicked. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOndblclick() {
		return  (String)getStateHelper().eval(PropertyKeys.ondblclick);
	}
	
	/**
	 * Client side callback to execute when input element is double clicked. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOndblclick(String _ondblclick) {
	    getStateHelper().put(PropertyKeys.ondblclick, _ondblclick);
    }
	

	/**
	 * Client side callback to execute when input element receives focus. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnfocus() {
		return  (String)getStateHelper().eval(PropertyKeys.onfocus);
	}
	
	/**
	 * Client side callback to execute when input element receives focus. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnfocus(String _onfocus) {
	    getStateHelper().put(PropertyKeys.onfocus, _onfocus);
    }
	

	/**
	 * Client side callback to execute when a key is pressed down over input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnkeydown() {
		return  (String)getStateHelper().eval(PropertyKeys.onkeydown);
	}
	
	/**
	 * Client side callback to execute when a key is pressed down over input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnkeydown(String _onkeydown) {
	    getStateHelper().put(PropertyKeys.onkeydown, _onkeydown);
    }
	

	/**
	 * Client side callback to execute when a key is pressed and released over input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnkeypress() {
		return  (String)getStateHelper().eval(PropertyKeys.onkeypress);
	}
	
	/**
	 * Client side callback to execute when a key is pressed and released over input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnkeypress(String _onkeypress) {
	    getStateHelper().put(PropertyKeys.onkeypress, _onkeypress);
    }
	

	/**
	 * Client side callback to execute when a key is released over input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnkeyup() {
		return  (String)getStateHelper().eval(PropertyKeys.onkeyup);
	}
	
	/**
	 * Client side callback to execute when a key is released over input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnkeyup(String _onkeyup) {
	    getStateHelper().put(PropertyKeys.onkeyup, _onkeyup);
    }
	

	/**
	 * Client side callback to execute when a pointer input element is pressed down over input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnmousedown() {
		return  (String)getStateHelper().eval(PropertyKeys.onmousedown);
	}
	
	/**
	 * Client side callback to execute when a pointer input element is pressed down over input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnmousedown(String _onmousedown) {
	    getStateHelper().put(PropertyKeys.onmousedown, _onmousedown);
    }
	

	/**
	 * Client side callback to execute when a pointer input element is moved within input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnmousemove() {
		return  (String)getStateHelper().eval(PropertyKeys.onmousemove);
	}
	
	/**
	 * Client side callback to execute when a pointer input element is moved within input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnmousemove(String _onmousemove) {
	    getStateHelper().put(PropertyKeys.onmousemove, _onmousemove);
    }
	

	/**
	 * Client side callback to execute when a pointer input element is moved away from input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnmouseout() {
		return  (String)getStateHelper().eval(PropertyKeys.onmouseout);
	}
	
	/**
	 * Client side callback to execute when a pointer input element is moved away from input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnmouseout(String _onmouseout) {
	    getStateHelper().put(PropertyKeys.onmouseout, _onmouseout);
    }
	

	/**
	 * Client side callback to execute when a pointer input element is moved onto input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnmouseover() {
		return  (String)getStateHelper().eval(PropertyKeys.onmouseover);
	}
	
	/**
	 * Client side callback to execute when a pointer input element is moved onto input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnmouseover(String _onmouseover) {
	    getStateHelper().put(PropertyKeys.onmouseover, _onmouseover);
    }
	

	/**
	 * Client side callback to execute when a pointer input element is released over input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnmouseup() {
		return  (String)getStateHelper().eval(PropertyKeys.onmouseup);
	}
	
	/**
	 * Client side callback to execute when a pointer input element is released over input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnmouseup(String _onmouseup) {
	    getStateHelper().put(PropertyKeys.onmouseup, _onmouseup);
    }
	

	/**
	 * Client side callback to execute when text within input element is selected by user. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnselect() {
		return  (String)getStateHelper().eval(PropertyKeys.onselect);
	}
	
	/**
	 * Client side callback to execute when text within input element is selected by user. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnselect(String _onselect) {
	    getStateHelper().put(PropertyKeys.onselect, _onselect);
    }
	

	/**
	 * The placeholder attribute shows text in a field until the field is focused upon, then hides the text. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getPlaceholder() {
		return  (String)getStateHelper().eval(PropertyKeys.placeholder);
	}
	
	/**
	 * The placeholder attribute shows text in a field until the field is focused upon, then hides the text. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setPlaceholder(String _placeholder) {
	    getStateHelper().put(PropertyKeys.placeholder, _placeholder);
    }
	

	/**
	 * Comma or space separated list of ids or search expressions denoting which values are to be sent to the server. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getProcess() {
		return  (String)getStateHelper().eval(PropertyKeys.process);
	}
	
	/**
	 * Comma or space separated list of ids or search expressions denoting which values are to be sent to the server. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setProcess(String _process) {
	    getStateHelper().put(PropertyKeys.process, _process);
    }
	

	/**
	 * Flag indicating that this input element will prevent changes by the user. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isReadonly() {
		return (boolean) (Boolean)getStateHelper().eval(PropertyKeys.readonly, false);
	}
	
	/**
	 * Flag indicating that this input element will prevent changes by the user. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setReadonly(boolean _readonly) {
	    getStateHelper().put(PropertyKeys.readonly, _readonly);
    }
	

	/**
	 * Allows you to suppress automatic rendering of labels. Used by AngularFaces, too. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isRenderLabel() {
		return (boolean) (Boolean)getStateHelper().eval(PropertyKeys.renderLabel, false);
	}
	
	/**
	 * Allows you to suppress automatic rendering of labels. Used by AngularFaces, too. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setRenderLabel(boolean _renderLabel) {
	    getStateHelper().put(PropertyKeys.renderLabel, _renderLabel);
    }
	

	/**
	 * Boolean value Require input in the component when the form is submitted. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isRequired() {
		return (boolean) (Boolean)getStateHelper().eval(PropertyKeys.required, false);
	}
	
	/**
	 * Boolean value Require input in the component when the form is submitted. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setRequired(boolean _required) {
	    getStateHelper().put(PropertyKeys.required, _required);
    }
	

	/**
	 * Message to show if the user did not specify a value and the attribute required is set to true. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getRequiredMessage() {
		return  (String)getStateHelper().eval(PropertyKeys.requiredMessage);
	}
	
	/**
	 * Message to show if the user did not specify a value and the attribute required is set to true. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setRequiredMessage(String _requiredMessage) {
	    getStateHelper().put(PropertyKeys.requiredMessage, _requiredMessage);
    }
	

	/**
	 * Number of characters used to determine the width of the input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getSize() {
		return (int) (Integer)getStateHelper().eval(PropertyKeys.size, 0);
	}
	
	/**
	 * Number of characters used to determine the width of the input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setSize(int _size) {
	    getStateHelper().put(PropertyKeys.size, _size);
    }
	

	/**
	 * The size of the input specified as number of grid columns. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getSpan() {
		return (int) (Integer)getStateHelper().eval(PropertyKeys.span, 0);
	}
	
	/**
	 * The size of the input specified as number of grid columns. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setSpan(int _span) {
	    getStateHelper().put(PropertyKeys.span, _span);
    }
	

	/**
	 * Inline style of the input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getStyle() {
		return  (String)getStateHelper().eval(PropertyKeys.style);
	}
	
	/**
	 * Inline style of the input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setStyle(String _style) {
	    getStateHelper().put(PropertyKeys.style, _style);
    }
	

	/**
	 * Style class of the input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getStyleClass() {
		return  (String)getStateHelper().eval(PropertyKeys.styleClass);
	}
	
	/**
	 * Style class of the input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setStyleClass(String _styleClass) {
	    getStateHelper().put(PropertyKeys.styleClass, _styleClass);
    }
	

	/**
	 * Position of this element in the tabbing order for the current document.  This value must be an integer between 0 and 32767. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTabindex() {
		return  (String)getStateHelper().eval(PropertyKeys.tabindex);
	}
	
	/**
	 * Position of this element in the tabbing order for the current document.  This value must be an integer between 0 and 32767. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTabindex(String _tabindex) {
	    getStateHelper().put(PropertyKeys.tabindex, _tabindex);
    }
	

	/**
	 * Advisory tooltip information. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTitle() {
		return  (String)getStateHelper().eval(PropertyKeys.title);
	}
	
	/**
	 * Advisory tooltip information. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTitle(String _title) {
	    getStateHelper().put(PropertyKeys.title, _title);
    }
	

	/**
	 * The text of the tooltip. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTooltip() {
		return  (String)getStateHelper().eval(PropertyKeys.tooltip);
	}
	
	/**
	 * The text of the tooltip. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltip(String _tooltip) {
	    getStateHelper().put(PropertyKeys.tooltip, _tooltip);
    }
	

	/**
	 * Where is the tooltip div generated? That's primarily a technical value that can be used to fix rendering errors in special cases. Also see data-container in the documentation of Bootstrap. The default value is body. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTooltipContainer() {
		return  (String)getStateHelper().eval(PropertyKeys.tooltipContainer, "body");
	}
	
	/**
	 * Where is the tooltip div generated? That's primarily a technical value that can be used to fix rendering errors in special cases. Also see data-container in the documentation of Bootstrap. The default value is body. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipContainer(String _tooltipContainer) {
	    getStateHelper().put(PropertyKeys.tooltipContainer, _tooltipContainer);
    }
	

	/**
	 * The tooltip is shown and hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getTooltipDelay() {
		return (int) (Integer)getStateHelper().eval(PropertyKeys.tooltipDelay, 0);
	}
	
	/**
	 * The tooltip is shown and hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipDelay(int _tooltipDelay) {
	    getStateHelper().put(PropertyKeys.tooltipDelay, _tooltipDelay);
    }
	

	/**
	 * The tooltip is hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getTooltipDelayHide() {
		return (int) (Integer)getStateHelper().eval(PropertyKeys.tooltipDelayHide, 0);
	}
	
	/**
	 * The tooltip is hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipDelayHide(int _tooltipDelayHide) {
	    getStateHelper().put(PropertyKeys.tooltipDelayHide, _tooltipDelayHide);
    }
	

	/**
	 * The tooltip is shown with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getTooltipDelayShow() {
		return (int) (Integer)getStateHelper().eval(PropertyKeys.tooltipDelayShow, 0);
	}
	
	/**
	 * The tooltip is shown with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipDelayShow(int _tooltipDelayShow) {
	    getStateHelper().put(PropertyKeys.tooltipDelayShow, _tooltipDelayShow);
    }
	

	/**
	 * Where is the tooltip to be displayed? Possible values: "top", "bottom", "right", "left", "auto", "auto top", "auto bottom", "auto right" and "auto left". Default to "bottom". <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTooltipPosition() {
		return  (String)getStateHelper().eval(PropertyKeys.tooltipPosition);
	}
	
	/**
	 * Where is the tooltip to be displayed? Possible values: "top", "bottom", "right", "left", "auto", "auto top", "auto bottom", "auto right" and "auto left". Default to "bottom". <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipPosition(String _tooltipPosition) {
	    getStateHelper().put(PropertyKeys.tooltipPosition, _tooltipPosition);
    }
	

	/**
	 * Type of the input. The default is text. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getType() {
		return  (String)getStateHelper().eval(PropertyKeys.type);
	}
	
	/**
	 * Type of the input. The default is text. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setType(String _type) {
	    getStateHelper().put(PropertyKeys.type, _type);
    }
	

	/**
	 * Component(s) to be updated with ajax. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getUpdate() {
		return  (String)getStateHelper().eval(PropertyKeys.update);
	}
	
	/**
	 * Component(s) to be updated with ajax. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setUpdate(String _update) {
	    getStateHelper().put(PropertyKeys.update, _update);
    }
	
}

