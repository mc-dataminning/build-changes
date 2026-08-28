import java.util.Arrays;
import java.util.Collection;

public class wv {
   public static final ww a = ww.i();
   public static final ww b = ww.c("options.on");
   public static final ww c = ww.c("options.off");
   public static final ww d = ww.c("gui.done");
   public static final ww e = ww.c("gui.cancel");
   public static final ww f = ww.c("gui.yes");
   public static final ww g = ww.c("gui.no");
   public static final ww h = ww.c("gui.ok");
   public static final ww i = ww.c("gui.proceed");
   public static final ww j = ww.c("gui.continue");
   public static final ww k = ww.c("gui.back");
   public static final ww l = ww.c("gui.toTitle");
   public static final ww m = ww.c("gui.acknowledge");
   public static final ww n = ww.c("chat.link.open");
   public static final ww o = ww.c("gui.copy_link_to_clipboard");
   public static final ww p = ww.c("menu.disconnect");
   public static final ww q = ww.c("connect.failed.transfer");
   public static final ww r = ww.c("connect.failed");
   public static final ww s = ww.b("\n");
   public static final ww t = ww.b(". ");
   public static final ww u = ww.b("...");
   public static final ww v = a();

   public static xk a() {
      return ww.b(" ");
   }

   public static xk a(long $$0) {
      return ww.a("gui.days", $$0);
   }

   public static xk b(long $$0) {
      return ww.a("gui.hours", $$0);
   }

   public static xk c(long $$0) {
      return ww.a("gui.minutes", $$0);
   }

   public static ww a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static xk a(ww $$0, boolean $$1) {
      return ww.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static xk a(ww $$0, ww $$1) {
      return ww.a("options.generic_value", $$0, $$1);
   }

   public static xk a(ww... $$0) {
      xk $$1 = ww.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static ww b(ww... $$0) {
      return a(Arrays.asList($$0));
   }

   public static ww a(Collection<? extends ww> $$0) {
      return wz.a($$0, s);
   }
}
