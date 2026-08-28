import java.util.Arrays;
import java.util.Collection;

public class wo {
   public static final wp a = wp.i();
   public static final wp b = wp.c("options.on");
   public static final wp c = wp.c("options.off");
   public static final wp d = wp.c("gui.done");
   public static final wp e = wp.c("gui.cancel");
   public static final wp f = wp.c("gui.yes");
   public static final wp g = wp.c("gui.no");
   public static final wp h = wp.c("gui.ok");
   public static final wp i = wp.c("gui.proceed");
   public static final wp j = wp.c("gui.continue");
   public static final wp k = wp.c("gui.back");
   public static final wp l = wp.c("gui.toTitle");
   public static final wp m = wp.c("gui.acknowledge");
   public static final wp n = wp.c("chat.link.open");
   public static final wp o = wp.c("gui.copy_link_to_clipboard");
   public static final wp p = wp.c("menu.disconnect");
   public static final wp q = wp.c("connect.failed.transfer");
   public static final wp r = wp.c("connect.failed");
   public static final wp s = wp.b("\n");
   public static final wp t = wp.b(". ");
   public static final wp u = wp.b("...");
   public static final wp v = a();

   public static xd a() {
      return wp.b(" ");
   }

   public static xd a(long $$0) {
      return wp.a("gui.days", $$0);
   }

   public static xd b(long $$0) {
      return wp.a("gui.hours", $$0);
   }

   public static xd c(long $$0) {
      return wp.a("gui.minutes", $$0);
   }

   public static wp a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static xd a(wp $$0, boolean $$1) {
      return wp.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static xd a(wp $$0, wp $$1) {
      return wp.a("options.generic_value", $$0, $$1);
   }

   public static xd a(wp... $$0) {
      xd $$1 = wp.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static wp b(wp... $$0) {
      return a(Arrays.asList($$0));
   }

   public static wp a(Collection<? extends wp> $$0) {
      return ws.a($$0, s);
   }
}
