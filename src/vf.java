import java.util.Arrays;
import java.util.Collection;

public class vf {
   public static final vg a = vg.i();
   public static final vg b = vg.c("options.on");
   public static final vg c = vg.c("options.off");
   public static final vg d = vg.c("gui.done");
   public static final vg e = vg.c("gui.cancel");
   public static final vg f = vg.c("gui.yes");
   public static final vg g = vg.c("gui.no");
   public static final vg h = vg.c("gui.ok");
   public static final vg i = vg.c("gui.proceed");
   public static final vg j = vg.c("gui.continue");
   public static final vg k = vg.c("gui.back");
   public static final vg l = vg.c("gui.toTitle");
   public static final vg m = vg.c("gui.acknowledge");
   public static final vg n = vg.c("chat.link.open");
   public static final vg o = vg.c("gui.copy_link_to_clipboard");
   public static final vg p = vg.c("menu.disconnect");
   public static final vg q = vg.c("connect.failed");
   public static final vg r = vg.b("\n");
   public static final vg s = vg.b(". ");
   public static final vg t = vg.b("...");
   public static final vg u = a();

   public static vu a() {
      return vg.b(" ");
   }

   public static vu a(long $$0) {
      return vg.a("gui.days", $$0);
   }

   public static vu b(long $$0) {
      return vg.a("gui.hours", $$0);
   }

   public static vu c(long $$0) {
      return vg.a("gui.minutes", $$0);
   }

   public static vg a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static vu a(vg $$0, boolean $$1) {
      return vg.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static vu a(vg $$0, vg $$1) {
      return vg.a("options.generic_value", $$0, $$1);
   }

   public static vu a(vg... $$0) {
      vu $$1 = vg.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(s);
         }
      }

      return $$1;
   }

   public static vg b(vg... $$0) {
      return a(Arrays.asList($$0));
   }

   public static vg a(Collection<? extends vg> $$0) {
      return vj.a($$0, r);
   }
}
