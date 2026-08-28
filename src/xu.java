import java.util.Arrays;
import java.util.Collection;

public class xu {
   public static final xv a = xv.i();
   public static final xv b = xv.c("options.on");
   public static final xv c = xv.c("options.off");
   public static final xv d = xv.c("gui.done");
   public static final xv e = xv.c("gui.cancel");
   public static final xv f = xv.c("gui.yes");
   public static final xv g = xv.c("gui.no");
   public static final xv h = xv.c("gui.ok");
   public static final xv i = xv.c("gui.proceed");
   public static final xv j = xv.c("gui.continue");
   public static final xv k = xv.c("gui.back");
   public static final xv l = xv.c("gui.toTitle");
   public static final xv m = xv.c("gui.acknowledge");
   public static final xv n = xv.c("chat.link.open");
   public static final xv o = xv.c("gui.copy_link_to_clipboard");
   public static final xv p = xv.c("menu.disconnect");
   public static final xv q = xv.c("connect.failed.transfer");
   public static final xv r = xv.c("connect.failed");
   public static final xv s = xv.b("\n");
   public static final xv t = xv.b(". ");
   public static final xv u = xv.b("...");
   public static final xv v = a();

   public static yj a() {
      return xv.b(" ");
   }

   public static yj a(long $$0) {
      return xv.a("gui.days", $$0);
   }

   public static yj b(long $$0) {
      return xv.a("gui.hours", $$0);
   }

   public static yj c(long $$0) {
      return xv.a("gui.minutes", $$0);
   }

   public static xv a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static yj a(xv $$0, boolean $$1) {
      return xv.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static yj a(xv $$0, xv $$1) {
      return xv.a("options.generic_value", $$0, $$1);
   }

   public static yj a(xv... $$0) {
      yj $$1 = xv.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static xv b(xv... $$0) {
      return a(Arrays.asList($$0));
   }

   public static xv a(Collection<? extends xv> $$0) {
      return xy.a($$0, s);
   }
}
