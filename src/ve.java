import java.util.Arrays;
import java.util.Collection;

public class ve {
   public static final vf a = vf.i();
   public static final vf b = vf.c("options.on");
   public static final vf c = vf.c("options.off");
   public static final vf d = vf.c("gui.done");
   public static final vf e = vf.c("gui.cancel");
   public static final vf f = vf.c("gui.yes");
   public static final vf g = vf.c("gui.no");
   public static final vf h = vf.c("gui.ok");
   public static final vf i = vf.c("gui.proceed");
   public static final vf j = vf.c("gui.continue");
   public static final vf k = vf.c("gui.back");
   public static final vf l = vf.c("gui.toTitle");
   public static final vf m = vf.c("gui.acknowledge");
   public static final vf n = vf.c("chat.link.open");
   public static final vf o = vf.c("gui.copy_link_to_clipboard");
   public static final vf p = vf.c("menu.disconnect");
   public static final vf q = vf.c("connect.failed");
   public static final vf r = vf.b("\n");
   public static final vf s = vf.b(". ");
   public static final vf t = vf.b("...");
   public static final vf u = a();

   public static vt a() {
      return vf.b(" ");
   }

   public static vt a(long $$0) {
      return vf.a("gui.days", $$0);
   }

   public static vt b(long $$0) {
      return vf.a("gui.hours", $$0);
   }

   public static vt c(long $$0) {
      return vf.a("gui.minutes", $$0);
   }

   public static vf a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static vt a(vf $$0, boolean $$1) {
      return vf.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static vt a(vf $$0, vf $$1) {
      return vf.a("options.generic_value", $$0, $$1);
   }

   public static vt a(vf... $$0) {
      vt $$1 = vf.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(s);
         }
      }

      return $$1;
   }

   public static vf b(vf... $$0) {
      return a(Arrays.asList($$0));
   }

   public static vf a(Collection<? extends vf> $$0) {
      return vi.a($$0, r);
   }
}
