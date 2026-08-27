import java.util.Arrays;
import java.util.Collection;

public class va {
   public static final vb a = vb.i();
   public static final vb b = vb.c("options.on");
   public static final vb c = vb.c("options.off");
   public static final vb d = vb.c("gui.done");
   public static final vb e = vb.c("gui.cancel");
   public static final vb f = vb.c("gui.yes");
   public static final vb g = vb.c("gui.no");
   public static final vb h = vb.c("gui.ok");
   public static final vb i = vb.c("gui.proceed");
   public static final vb j = vb.c("gui.continue");
   public static final vb k = vb.c("gui.back");
   public static final vb l = vb.c("gui.toTitle");
   public static final vb m = vb.c("gui.acknowledge");
   public static final vb n = vb.c("chat.link.open");
   public static final vb o = vb.c("gui.copy_link_to_clipboard");
   public static final vb p = vb.c("menu.disconnect");
   public static final vb q = vb.c("connect.failed");
   public static final vb r = vb.b("\n");
   public static final vb s = vb.b(". ");
   public static final vb t = vb.b("...");
   public static final vb u = a();

   public static vp a() {
      return vb.b(" ");
   }

   public static vp a(long $$0) {
      return vb.a("gui.days", $$0);
   }

   public static vp b(long $$0) {
      return vb.a("gui.hours", $$0);
   }

   public static vp c(long $$0) {
      return vb.a("gui.minutes", $$0);
   }

   public static vb a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static vp a(vb $$0, boolean $$1) {
      return vb.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static vp a(vb $$0, vb $$1) {
      return vb.a("options.generic_value", $$0, $$1);
   }

   public static vp a(vb... $$0) {
      vp $$1 = vb.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(s);
         }
      }

      return $$1;
   }

   public static vb b(vb... $$0) {
      return a(Arrays.asList($$0));
   }

   public static vb a(Collection<? extends vb> $$0) {
      return ve.a($$0, r);
   }
}
