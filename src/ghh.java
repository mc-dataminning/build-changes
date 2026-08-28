import java.util.List;
import java.util.Locale;

public enum ghh {
   a("i_want_to_report_them"),
   b("hate_speech"),
   c("harassment_or_bullying"),
   d("self_harm_or_suicide"),
   e("imminent_harm"),
   f("defamation_impersonation_false_information"),
   g("alcohol_tobacco_drugs"),
   h("child_sexual_exploitation_or_abuse"),
   i("terrorism_or_violent_extremism"),
   j("non_consensual_intimate_imagery"),
   k("sexually_inappropriate");

   private final String l;
   private final wp m;
   private final wp n;

   private ghh(final String $$0) {
      this.l = $$0.toUpperCase(Locale.ROOT);
      String $$1 = "gui.abuseReport.reason." + $$0;
      this.m = wp.c($$1);
      this.n = wp.c($$1 + ".description");
   }

   public String a() {
      return this.l;
   }

   public wp b() {
      return this.m;
   }

   public wp c() {
      return this.n;
   }

   public static List<ghh> a(ghi $$0) {
      return switch ($$0) {
         case a -> List.of(k);
         case b -> List.of(e, f);
         default -> List.of();
      };
   }
}
