import java.util.Arrays;
import java.util.Collection;

public class vt {
   public static final vu a = vu.i();
   public static final vu b = vu.c("options.on");
   public static final vu c = vu.c("options.off");
   public static final vu d = vu.c("gui.done");
   public static final vu e = vu.c("gui.cancel");
   public static final vu f = vu.c("gui.yes");
   public static final vu g = vu.c("gui.no");
   public static final vu h = vu.c("gui.ok");
   public static final vu i = vu.c("gui.proceed");
   public static final vu j = vu.c("gui.continue");
   public static final vu k = vu.c("gui.back");
   public static final vu l = vu.c("gui.toTitle");
   public static final vu m = vu.c("gui.acknowledge");
   public static final vu n = vu.c("chat.link.open");
   public static final vu o = vu.c("gui.copy_link_to_clipboard");
   public static final vu p = vu.c("menu.disconnect");
   public static final vu q = vu.c("connect.failed.transfer");
   public static final vu r = vu.c("connect.failed");
   public static final vu s = vu.b("\n");
   public static final vu t = vu.b(". ");
   public static final vu u = vu.b("...");
   public static final vu v = a();

   public static wi a() {
      return vu.b(" ");
   }

   public static wi a(long $$0) {
      return vu.a("gui.days", $$0);
   }

   public static wi b(long $$0) {
      return vu.a("gui.hours", $$0);
   }

   public static wi c(long $$0) {
      return vu.a("gui.minutes", $$0);
   }

   public static vu a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static wi a(vu $$0, boolean $$1) {
      return vu.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static wi a(vu $$0, vu $$1) {
      return vu.a("options.generic_value", $$0, $$1);
   }

   public static wi a(vu... $$0) {
      wi $$1 = vu.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static vu b(vu... $$0) {
      return a(Arrays.asList($$0));
   }

   public static vu a(Collection<? extends vu> $$0) {
      return vx.a($$0, s);
   }
}
