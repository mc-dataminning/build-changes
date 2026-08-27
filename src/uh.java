import java.util.Arrays;
import java.util.Collection;

public class uh {
   public static final ui a = ui.i();
   public static final ui b = ui.c("options.on");
   public static final ui c = ui.c("options.off");
   public static final ui d = ui.c("gui.done");
   public static final ui e = ui.c("gui.cancel");
   public static final ui f = ui.c("gui.yes");
   public static final ui g = ui.c("gui.no");
   public static final ui h = ui.c("gui.ok");
   public static final ui i = ui.c("gui.proceed");
   public static final ui j = ui.c("gui.continue");
   public static final ui k = ui.c("gui.back");
   public static final ui l = ui.c("gui.toTitle");
   public static final ui m = ui.c("gui.acknowledge");
   public static final ui n = ui.c("chat.link.open");
   public static final ui o = ui.c("gui.copy_link_to_clipboard");
   public static final ui p = ui.c("menu.disconnect");
   public static final ui q = ui.c("connect.failed");
   public static final ui r = ui.b("\n");
   public static final ui s = ui.b(". ");
   public static final ui t = ui.b("...");
   public static final ui u = a();

   public static uw a() {
      return ui.b(" ");
   }

   public static uw a(long $$0) {
      return ui.a("gui.days", $$0);
   }

   public static uw b(long $$0) {
      return ui.a("gui.hours", $$0);
   }

   public static uw c(long $$0) {
      return ui.a("gui.minutes", $$0);
   }

   public static ui a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static uw a(ui $$0, boolean $$1) {
      return ui.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static uw a(ui $$0, ui $$1) {
      return ui.a("options.generic_value", $$0, $$1);
   }

   public static uw a(ui... $$0) {
      uw $$1 = ui.i();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(s);
         }
      }

      return $$1;
   }

   public static ui b(ui... $$0) {
      return a(Arrays.asList($$0));
   }

   public static ui a(Collection<? extends ui> $$0) {
      return ul.a($$0, r);
   }
}
