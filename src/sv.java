import java.util.Arrays;
import java.util.Collection;

public class sv {
   public static final sw a = sw.h();
   public static final sw b = sw.c("options.on");
   public static final sw c = sw.c("options.off");
   public static final sw d = sw.c("gui.done");
   public static final sw e = sw.c("gui.cancel");
   public static final sw f = sw.c("gui.yes");
   public static final sw g = sw.c("gui.no");
   public static final sw h = sw.c("gui.ok");
   public static final sw i = sw.c("gui.proceed");
   public static final sw j = sw.c("gui.continue");
   public static final sw k = sw.c("gui.back");
   public static final sw l = sw.c("gui.toTitle");
   public static final sw m = sw.c("gui.acknowledge");
   public static final sw n = sw.c("chat.link.open");
   public static final sw o = sw.c("gui.copy_link_to_clipboard");
   public static final sw p = sw.c("connect.failed");
   public static final sw q = sw.b("\n");
   public static final sw r = sw.b(". ");
   public static final sw s = sw.b("...");
   public static final sw t = a();

   public static tj a() {
      return sw.b(" ");
   }

   public static tj a(long $$0) {
      return sw.a("gui.days", $$0);
   }

   public static tj b(long $$0) {
      return sw.a("gui.hours", $$0);
   }

   public static tj c(long $$0) {
      return sw.a("gui.minutes", $$0);
   }

   public static sw a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static tj a(sw $$0, boolean $$1) {
      return sw.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static tj a(sw $$0, sw $$1) {
      return sw.a("options.generic_value", $$0, $$1);
   }

   public static tj a(sw... $$0) {
      tj $$1 = sw.h();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(r);
         }
      }

      return $$1;
   }

   public static sw b(sw... $$0) {
      return a(Arrays.asList($$0));
   }

   public static sw a(Collection<? extends sw> $$0) {
      return sy.a($$0, q);
   }
}
