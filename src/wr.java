import java.util.Arrays;
import java.util.Collection;

public class wr {
   public static final ws a = ws.i();
   public static final ws b = ws.c("options.on");
   public static final ws c = ws.c("options.off");
   public static final ws d = ws.c("gui.done");
   public static final ws e = ws.c("gui.cancel");
   public static final ws f = ws.c("gui.yes");
   public static final ws g = ws.c("gui.no");
   public static final ws h = ws.c("gui.ok");
   public static final ws i = ws.c("gui.proceed");
   public static final ws j = ws.c("gui.continue");
   public static final ws k = ws.c("gui.back");
   public static final ws l = ws.c("gui.toTitle");
   public static final ws m = ws.c("gui.acknowledge");
   public static final ws n = ws.c("chat.link.open");
   public static final ws o = ws.c("gui.copy_link_to_clipboard");
   public static final ws p = ws.c("menu.disconnect");
   public static final ws q = ws.c("connect.failed.transfer");
   public static final ws r = ws.c("connect.failed");
   public static final ws s = ws.b("\n");
   public static final ws t = ws.b(". ");
   public static final ws u = ws.b("...");
   public static final ws v = a();

   public static xg a() {
      return ws.b(" ");
   }

   public static xg a(long $$0) {
      return ws.a("gui.days", $$0);
   }

   public static xg b(long $$0) {
      return ws.a("gui.hours", $$0);
   }

   public static xg c(long $$0) {
      return ws.a("gui.minutes", $$0);
   }

   public static ws a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static xg a(ws $$0, boolean $$1) {
      return ws.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static xg a(ws $$0, ws $$1) {
      return ws.a("options.generic_value", $$0, $$1);
   }

   public static xg a(ws... $$0) {
      xg $$1 = ws.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(t);
         }
      }

      return $$1;
   }

   public static ws b(ws... $$0) {
      return a(Arrays.asList($$0));
   }

   public static ws a(Collection<? extends ws> $$0) {
      return wv.a($$0, s);
   }
}
