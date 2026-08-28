import java.util.Arrays;
import java.util.Collection;

public class xj {
   public static final xk a = xk.i();
   public static final xk b = xk.c("options.on");
   public static final xk c = xk.c("options.off");
   public static final xk d = xk.c("gui.done");
   public static final xk e = xk.c("gui.cancel");
   public static final xk f = xk.c("gui.yes");
   public static final xk g = xk.c("gui.no");
   public static final xk h = xk.c("gui.ok");
   public static final xk i = xk.c("gui.proceed");
   public static final xk j = xk.c("gui.continue");
   public static final xk k = xk.c("gui.back");
   public static final xk l = xk.c("gui.toTitle");
   public static final xk m = xk.c("gui.acknowledge");
   public static final xk n = xk.c("chat.link.open");
   public static final xk o = xk.c("gui.copy_link_to_clipboard");
   public static final xk p = xk.c("menu.disconnect");
   public static final xk q = xk.c("connect.failed.transfer");
   public static final xk r = xk.c("connect.failed");
   public static final xk s = xk.b("\n");
   public static final xk t = xk.b(". ");
   public static final xk u = xk.b("...");
   public static final xk v = a();

   public static xy a() {
      return xk.b(" ");
   }

   public static xy a(long $$0) {
      return xk.a("gui.days", $$0);
   }

   public static xy b(long $$0) {
      return xk.a("gui.hours", $$0);
   }

   public static xy c(long $$0) {
      return xk.a("gui.minutes", $$0);
   }

   public static xk a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static xy a(xk $$0, boolean $$1) {
      return xk.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static xy a(xk $$0, xk $$1) {
      return xk.a("options.generic_value", $$0, $$1);
   }

   public static xy a(xk... $$0) {
      xy $$1 = xk.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static xk b(xk... $$0) {
      return a(Arrays.asList($$0));
   }

   public static xk a(Collection<? extends xk> $$0) {
      return xn.a($$0, s);
   }
}
