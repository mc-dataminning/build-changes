import java.util.Arrays;
import java.util.Collection;

public class te {
   public static final tf a = tf.h();
   public static final tf b = tf.c("options.on");
   public static final tf c = tf.c("options.off");
   public static final tf d = tf.c("gui.done");
   public static final tf e = tf.c("gui.cancel");
   public static final tf f = tf.c("gui.yes");
   public static final tf g = tf.c("gui.no");
   public static final tf h = tf.c("gui.ok");
   public static final tf i = tf.c("gui.proceed");
   public static final tf j = tf.c("gui.continue");
   public static final tf k = tf.c("gui.back");
   public static final tf l = tf.c("gui.toTitle");
   public static final tf m = tf.c("gui.acknowledge");
   public static final tf n = tf.c("chat.link.open");
   public static final tf o = tf.c("gui.copy_link_to_clipboard");
   public static final tf p = tf.c("menu.disconnect");
   public static final tf q = tf.c("connect.failed");
   public static final tf r = tf.b("\n");
   public static final tf s = tf.b(". ");
   public static final tf t = tf.b("...");
   public static final tf u = a();

   public static ts a() {
      return tf.b(" ");
   }

   public static ts a(long $$0) {
      return tf.a("gui.days", $$0);
   }

   public static ts b(long $$0) {
      return tf.a("gui.hours", $$0);
   }

   public static ts c(long $$0) {
      return tf.a("gui.minutes", $$0);
   }

   public static tf a(boolean $$0) {
      return $$0 ? b : c;
   }

   public static ts a(tf $$0, boolean $$1) {
      return tf.a($$1 ? "options.on.composed" : "options.off.composed", $$0);
   }

   public static ts a(tf $$0, tf $$1) {
      return tf.a("options.generic_value", $$0, $$1);
   }

   public static ts a(tf... $$0) {
      ts $$1 = tf.h();

      for (int $$2 = 0; $$2 < $$0.length; $$2++) {
         $$1.b($$0[$$2]);
         if ($$2 != $$0.length - 1) {
            $$1.b(s);
         }
      }

      return $$1;
   }

   public static tf b(tf... $$0) {
      return a(Arrays.asList($$0));
   }

   public static tf a(Collection<? extends tf> $$0) {
      return th.a($$0, r);
   }
}
