import java.util.Arrays;
import java.util.Collection;

public class xb {
   public static final xc a = xc.i();
   public static final xc b = xc.c("options.on");
   public static final xc c = xc.c("options.off");
   public static final xc d = xc.c("gui.done");
   public static final xc e = xc.c("gui.cancel");
   public static final xc f = xc.c("gui.yes");
   public static final xc g = xc.c("gui.no");
   public static final xc h = xc.c("gui.ok");
   public static final xc i = xc.c("gui.proceed");
   public static final xc j = xc.c("gui.continue");
   public static final xc k = xc.c("gui.back");
   public static final xc l = xc.c("gui.toTitle");
   public static final xc m = xc.c("gui.acknowledge");
   public static final xc n = xc.c("chat.link.open");
   public static final xc o = xc.c("gui.copy_link_to_clipboard");
   public static final xc p = xc.c("menu.disconnect");
   public static final xc q = xc.c("connect.failed.transfer");
   public static final xc r = xc.c("connect.failed");
   public static final xc s = xc.b("\n");
   public static final xc t = xc.b(". ");
   public static final xc u = xc.b("...");
   public static final xc v = a();

   public static xq a() {
      return xc.b(" ");
   }

   public static xq a(long $$0) {
      return xc.a("gui.days", $$0);
   }

   public static xq b(long $$0) {
      return xc.a("gui.hours", $$0);
   }

   public static xq c(long $$0) {
      return xc.a("gui.minutes", $$0);
   }

   public static xc a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static xq a(xc $$0, boolean $$1) {
      return xc.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static xq a(xc $$0, xc $$1) {
      return xc.a("options.generic_value", $$0, $$1);
   }

   public static xq a(xc... $$0) {
      xq $$1 = xc.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static xc b(xc... $$0) {
      return a(Arrays.asList($$0));
   }

   public static xc a(Collection<? extends xc> $$0) {
      return xf.a($$0, s);
   }
}
