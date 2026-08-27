import java.util.Arrays;
import java.util.Collection;

public class tm {
   public static final tn a = tn.h();
   public static final tn b = tn.c("options.on");
   public static final tn c = tn.c("options.off");
   public static final tn d = tn.c("gui.done");
   public static final tn e = tn.c("gui.cancel");
   public static final tn f = tn.c("gui.yes");
   public static final tn g = tn.c("gui.no");
   public static final tn h = tn.c("gui.ok");
   public static final tn i = tn.c("gui.proceed");
   public static final tn j = tn.c("gui.continue");
   public static final tn k = tn.c("gui.back");
   public static final tn l = tn.c("gui.toTitle");
   public static final tn m = tn.c("gui.acknowledge");
   public static final tn n = tn.c("chat.link.open");
   public static final tn o = tn.c("gui.copy_link_to_clipboard");
   public static final tn p = tn.c("menu.disconnect");
   public static final tn q = tn.c("connect.failed");
   public static final tn r = tn.b("\n");
   public static final tn s = tn.b(". ");
   public static final tn t = tn.b("...");
   public static final tn u = a();

   public static ua a() {
      return tn.b(" ");
   }

   public static ua a(long $$0) {
      return tn.a("gui.days", $$0);
   }

   public static ua b(long $$0) {
      return tn.a("gui.hours", $$0);
   }

   public static ua c(long $$0) {
      return tn.a("gui.minutes", $$0);
   }

   public static tn a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static ua a(tn $$0, boolean $$1) {
      return tn.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static ua a(tn $$0, tn $$1) {
      return tn.a("options.generic_value", $$0, $$1);
   }

   public static ua a(tn... $$0) {
      ua $$1 = tn.h();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(s);
         }
      }

      return $$1;
   }

   public static tn b(tn... $$0) {
      return a(Arrays.asList($$0));
   }

   public static tn a(Collection<? extends tn> $$0) {
      return tp.a($$0, r);
   }
}
