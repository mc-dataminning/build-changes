import java.util.Arrays;
import java.util.Collection;

public class uu {
   public static final uv a = uv.i();
   public static final uv b = uv.c("options.on");
   public static final uv c = uv.c("options.off");
   public static final uv d = uv.c("gui.done");
   public static final uv e = uv.c("gui.cancel");
   public static final uv f = uv.c("gui.yes");
   public static final uv g = uv.c("gui.no");
   public static final uv h = uv.c("gui.ok");
   public static final uv i = uv.c("gui.proceed");
   public static final uv j = uv.c("gui.continue");
   public static final uv k = uv.c("gui.back");
   public static final uv l = uv.c("gui.toTitle");
   public static final uv m = uv.c("gui.acknowledge");
   public static final uv n = uv.c("chat.link.open");
   public static final uv o = uv.c("gui.copy_link_to_clipboard");
   public static final uv p = uv.c("menu.disconnect");
   public static final uv q = uv.c("connect.failed");
   public static final uv r = uv.b("\n");
   public static final uv s = uv.b(". ");
   public static final uv t = uv.b("...");
   public static final uv u = a();

   public static vj a() {
      return uv.b(" ");
   }

   public static vj a(long $$0) {
      return uv.a("gui.days", $$0);
   }

   public static vj b(long $$0) {
      return uv.a("gui.hours", $$0);
   }

   public static vj c(long $$0) {
      return uv.a("gui.minutes", $$0);
   }

   public static uv a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static vj a(uv $$0, boolean $$1) {
      return uv.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static vj a(uv $$0, uv $$1) {
      return uv.a("options.generic_value", $$0, $$1);
   }

   public static vj a(uv... $$0) {
      vj $$1 = uv.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(s);
         }
      }

      return $$1;
   }

   public static uv b(uv... $$0) {
      return a(Arrays.asList($$0));
   }

   public static uv a(Collection<? extends uv> $$0) {
      return uy.a($$0, r);
   }
}
