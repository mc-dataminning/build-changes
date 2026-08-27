import java.util.Arrays;
import java.util.Collection;

public class vc {
   public static final vd a = vd.i();
   public static final vd b = vd.c("options.on");
   public static final vd c = vd.c("options.off");
   public static final vd d = vd.c("gui.done");
   public static final vd e = vd.c("gui.cancel");
   public static final vd f = vd.c("gui.yes");
   public static final vd g = vd.c("gui.no");
   public static final vd h = vd.c("gui.ok");
   public static final vd i = vd.c("gui.proceed");
   public static final vd j = vd.c("gui.continue");
   public static final vd k = vd.c("gui.back");
   public static final vd l = vd.c("gui.toTitle");
   public static final vd m = vd.c("gui.acknowledge");
   public static final vd n = vd.c("chat.link.open");
   public static final vd o = vd.c("gui.copy_link_to_clipboard");
   public static final vd p = vd.c("menu.disconnect");
   public static final vd q = vd.c("connect.failed");
   public static final vd r = vd.b("\n");
   public static final vd s = vd.b(". ");
   public static final vd t = vd.b("...");
   public static final vd u = a();

   public static vr a() {
      return vd.b(" ");
   }

   public static vr a(long $$0) {
      return vd.a("gui.days", $$0);
   }

   public static vr b(long $$0) {
      return vd.a("gui.hours", $$0);
   }

   public static vr c(long $$0) {
      return vd.a("gui.minutes", $$0);
   }

   public static vd a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static vr a(vd $$0, boolean $$1) {
      return vd.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static vr a(vd $$0, vd $$1) {
      return vd.a("options.generic_value", $$0, $$1);
   }

   public static vr a(vd... $$0) {
      vr $$1 = vd.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(s);
         }
      }

      return $$1;
   }

   public static vd b(vd... $$0) {
      return a(Arrays.asList($$0));
   }

   public static vd a(Collection<? extends vd> $$0) {
      return vg.a($$0, r);
   }
}
