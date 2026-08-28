import java.util.Arrays;
import java.util.Collection;

public class xk {
   public static final xl a = xl.i();
   public static final xl b = xl.c("options.on");
   public static final xl c = xl.c("options.off");
   public static final xl d = xl.c("gui.done");
   public static final xl e = xl.c("gui.cancel");
   public static final xl f = xl.c("gui.yes");
   public static final xl g = xl.c("gui.no");
   public static final xl h = xl.c("gui.ok");
   public static final xl i = xl.c("gui.proceed");
   public static final xl j = xl.c("gui.continue");
   public static final xl k = xl.c("gui.back");
   public static final xl l = xl.c("gui.toTitle");
   public static final xl m = xl.c("gui.acknowledge");
   public static final xl n = xl.c("chat.link.open");
   public static final xl o = xl.c("gui.copy_link_to_clipboard");
   public static final xl p = xl.c("menu.disconnect");
   public static final xl q = xl.c("connect.failed.transfer");
   public static final xl r = xl.c("connect.failed");
   public static final xl s = xl.b("\n");
   public static final xl t = xl.b(". ");
   public static final xl u = xl.b("...");
   public static final xl v = a();

   public static xz a() {
      return xl.b(" ");
   }

   public static xz a(long $$0) {
      return xl.a("gui.days", $$0);
   }

   public static xz b(long $$0) {
      return xl.a("gui.hours", $$0);
   }

   public static xz c(long $$0) {
      return xl.a("gui.minutes", $$0);
   }

   public static xl a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static xz a(xl $$0, boolean $$1) {
      return xl.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static xz a(xl $$0, xl $$1) {
      return xl.a("options.generic_value", $$0, $$1);
   }

   public static xz a(xl... $$0) {
      xz $$1 = xl.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static xl b(xl... $$0) {
      return a(Arrays.asList($$0));
   }

   public static xl a(Collection<? extends xl> $$0) {
      return xo.a($$0, s);
   }
}
