import java.util.List;
import java.util.Locale;

public enum gjg {
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
   private final wv m;
   private final wv n;

   private gjg(final String $$0) {
      this.l = $$0.toUpperCase(Locale.ROOT);
      String $$1 = "gui.abuseReport.reason." + $$0;
      this.m = wv.c($$1);
      this.n = wv.c($$1 + ".description");
   }

   public String a() {
      return this.l;
   }

   public wv b() {
      return this.m;
   }

   public wv c() {
      return this.n;
   }

   public static List<gjg> a(gjh $$0) {
      return switch ($$0) {
         case a -> List.of(k);
         case b -> List.of(e, f);
         default -> List.of();
      };
   }
}
