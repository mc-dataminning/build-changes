import java.util.Arrays;
import java.util.Collection;

public class th {
   public static final ti a = ti.h();
   public static final ti b = ti.c("options.on");
   public static final ti c = ti.c("options.off");
   public static final ti d = ti.c("gui.done");
   public static final ti e = ti.c("gui.cancel");
   public static final ti f = ti.c("gui.yes");
   public static final ti g = ti.c("gui.no");
   public static final ti h = ti.c("gui.ok");
   public static final ti i = ti.c("gui.proceed");
   public static final ti j = ti.c("gui.continue");
   public static final ti k = ti.c("gui.back");
   public static final ti l = ti.c("gui.toTitle");
   public static final ti m = ti.c("gui.acknowledge");
   public static final ti n = ti.c("chat.link.open");
   public static final ti o = ti.c("gui.copy_link_to_clipboard");
   public static final ti p = ti.c("menu.disconnect");
   public static final ti q = ti.c("connect.failed");
   public static final ti r = ti.b("\n");
   public static final ti s = ti.b(". ");
   public static final ti t = ti.b("...");
   public static final ti u = a();

   public static tv a() {
      return ti.b(" ");
   }

   public static tv a(long $$0) {
      return ti.a("gui.days", $$0);
   }

   public static tv b(long $$0) {
      return ti.a("gui.hours", $$0);
   }

   public static tv c(long $$0) {
      return ti.a("gui.minutes", $$0);
   }

   public static ti a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static tv a(ti $$0, boolean $$1) {
      return ti.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static tv a(ti $$0, ti $$1) {
      return ti.a("options.generic_value", $$0, $$1);
   }

   public static tv a(ti... $$0) {
      tv $$1 = ti.h();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(s);
         }
      }

      return $$1;
   }

   public static ti b(ti... $$0) {
      return a(Arrays.asList($$0));
   }

   public static ti a(Collection<? extends ti> $$0) {
      return tk.a($$0, r);
   }
}
