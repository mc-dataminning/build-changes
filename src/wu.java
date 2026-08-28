import java.util.Arrays;
import java.util.Collection;

public class wu {
   public static final wv a = wv.i();
   public static final wv b = wv.c("options.on");
   public static final wv c = wv.c("options.off");
   public static final wv d = wv.c("gui.done");
   public static final wv e = wv.c("gui.cancel");
   public static final wv f = wv.c("gui.yes");
   public static final wv g = wv.c("gui.no");
   public static final wv h = wv.c("gui.ok");
   public static final wv i = wv.c("gui.proceed");
   public static final wv j = wv.c("gui.continue");
   public static final wv k = wv.c("gui.back");
   public static final wv l = wv.c("gui.toTitle");
   public static final wv m = wv.c("gui.acknowledge");
   public static final wv n = wv.c("chat.link.open");
   public static final wv o = wv.c("gui.copy_link_to_clipboard");
   public static final wv p = wv.c("menu.disconnect");
   public static final wv q = wv.c("connect.failed.transfer");
   public static final wv r = wv.c("connect.failed");
   public static final wv s = wv.b("\n");
   public static final wv t = wv.b(". ");
   public static final wv u = wv.b("...");
   public static final wv v = a();

   public static xj a() {
      return wv.b(" ");
   }

   public static xj a(long $$0) {
      return wv.a("gui.days", $$0);
   }

   public static xj b(long $$0) {
      return wv.a("gui.hours", $$0);
   }

   public static xj c(long $$0) {
      return wv.a("gui.minutes", $$0);
   }

   public static wv a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static xj a(wv $$0, boolean $$1) {
      return wv.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static xj a(wv $$0, wv $$1) {
      return wv.a("options.generic_value", $$0, $$1);
   }

   public static xj a(wv... $$0) {
      xj $$1 = wv.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static wv b(wv... $$0) {
      return a(Arrays.asList($$0));
   }

   public static wv a(Collection<? extends wv> $$0) {
      return wy.a($$0, s);
   }
}
