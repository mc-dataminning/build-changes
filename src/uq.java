import java.util.Arrays;
import java.util.Collection;

public class uq {
   public static final ur a = ur.i();
   public static final ur b = ur.c("options.on");
   public static final ur c = ur.c("options.off");
   public static final ur d = ur.c("gui.done");
   public static final ur e = ur.c("gui.cancel");
   public static final ur f = ur.c("gui.yes");
   public static final ur g = ur.c("gui.no");
   public static final ur h = ur.c("gui.ok");
   public static final ur i = ur.c("gui.proceed");
   public static final ur j = ur.c("gui.continue");
   public static final ur k = ur.c("gui.back");
   public static final ur l = ur.c("gui.toTitle");
   public static final ur m = ur.c("gui.acknowledge");
   public static final ur n = ur.c("chat.link.open");
   public static final ur o = ur.c("gui.copy_link_to_clipboard");
   public static final ur p = ur.c("menu.disconnect");
   public static final ur q = ur.c("connect.failed");
   public static final ur r = ur.b("\n");
   public static final ur s = ur.b(". ");
   public static final ur t = ur.b("...");
   public static final ur u = a();

   public static vf a() {
      return ur.b(" ");
   }

   public static vf a(long $$0) {
      return ur.a("gui.days", $$0);
   }

   public static vf b(long $$0) {
      return ur.a("gui.hours", $$0);
   }

   public static vf c(long $$0) {
      return ur.a("gui.minutes", $$0);
   }

   public static ur a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static vf a(ur $$0, boolean $$1) {
      return ur.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static vf a(ur $$0, ur $$1) {
      return ur.a("options.generic_value", $$0, $$1);
   }

   public static vf a(ur... $$0) {
      vf $$1 = ur.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(s);
         }
      }

      return $$1;
   }

   public static ur b(ur... $$0) {
      return a(Arrays.asList($$0));
   }

   public static ur a(Collection<? extends ur> $$0) {
      return uu.a($$0, r);
   }
}
