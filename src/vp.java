import java.util.Arrays;
import java.util.Collection;

public class vp {
   public static final vq a = vq.i();
   public static final vq b = vq.c("options.on");
   public static final vq c = vq.c("options.off");
   public static final vq d = vq.c("gui.done");
   public static final vq e = vq.c("gui.cancel");
   public static final vq f = vq.c("gui.yes");
   public static final vq g = vq.c("gui.no");
   public static final vq h = vq.c("gui.ok");
   public static final vq i = vq.c("gui.proceed");
   public static final vq j = vq.c("gui.continue");
   public static final vq k = vq.c("gui.back");
   public static final vq l = vq.c("gui.toTitle");
   public static final vq m = vq.c("gui.acknowledge");
   public static final vq n = vq.c("chat.link.open");
   public static final vq o = vq.c("gui.copy_link_to_clipboard");
   public static final vq p = vq.c("menu.disconnect");
   public static final vq q = vq.c("connect.failed.transfer");
   public static final vq r = vq.c("connect.failed");
   public static final vq s = vq.b("\n");
   public static final vq t = vq.b(". ");
   public static final vq u = vq.b("...");
   public static final vq v = a();

   public static we a() {
      return vq.b(" ");
   }

   public static we a(long $$0) {
      return vq.a("gui.days", $$0);
   }

   public static we b(long $$0) {
      return vq.a("gui.hours", $$0);
   }

   public static we c(long $$0) {
      return vq.a("gui.minutes", $$0);
   }

   public static vq a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static we a(vq $$0, boolean $$1) {
      return vq.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static we a(vq $$0, vq $$1) {
      return vq.a("options.generic_value", $$0, $$1);
   }

   public static we a(vq... $$0) {
      we $$1 = vq.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static vq b(vq... $$0) {
      return a(Arrays.asList($$0));
   }

   public static vq a(Collection<? extends vq> $$0) {
      return vt.a($$0, s);
   }
}
