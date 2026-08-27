import java.util.Arrays;
import java.util.Collection;

public class ww {
   public static final wx a = wx.i();
   public static final wx b = wx.c("options.on");
   public static final wx c = wx.c("options.off");
   public static final wx d = wx.c("gui.done");
   public static final wx e = wx.c("gui.cancel");
   public static final wx f = wx.c("gui.yes");
   public static final wx g = wx.c("gui.no");
   public static final wx h = wx.c("gui.ok");
   public static final wx i = wx.c("gui.proceed");
   public static final wx j = wx.c("gui.continue");
   public static final wx k = wx.c("gui.back");
   public static final wx l = wx.c("gui.toTitle");
   public static final wx m = wx.c("gui.acknowledge");
   public static final wx n = wx.c("chat.link.open");
   public static final wx o = wx.c("gui.copy_link_to_clipboard");
   public static final wx p = wx.c("menu.disconnect");
   public static final wx q = wx.c("connect.failed.transfer");
   public static final wx r = wx.c("connect.failed");
   public static final wx s = wx.b("\n");
   public static final wx t = wx.b(". ");
   public static final wx u = wx.b("...");
   public static final wx v = a();

   public static xl a() {
      return wx.b(" ");
   }

   public static xl a(long $$0) {
      return wx.a("gui.days", $$0);
   }

   public static xl b(long $$0) {
      return wx.a("gui.hours", $$0);
   }

   public static xl c(long $$0) {
      return wx.a("gui.minutes", $$0);
   }

   public static wx a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static xl a(wx $$0, boolean $$1) {
      return wx.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static xl a(wx $$0, wx $$1) {
      return wx.a("options.generic_value", $$0, $$1);
   }

   public static xl a(wx... $$0) {
      xl $$1 = wx.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static wx b(wx... $$0) {
      return a(Arrays.asList($$0));
   }

   public static wx a(Collection<? extends wx> $$0) {
      return xa.a($$0, s);
   }
}
