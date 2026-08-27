import java.util.Locale;

public enum fws {
   a("generic"),
   b("hate_speech"),
   c("harassment_or_bullying"),
   d("self_harm_or_suicide"),
   e("imminent_harm"),
   f("defamation_impersonation_false_information"),
   g("alcohol_tobacco_drugs"),
   h("child_sexual_exploitation_or_abuse"),
   i("terrorism_or_violent_extremism"),
   j("non_consensual_intimate_imagery");

   private final String k;
   private final ws l;
   private final ws m;

   private fws(String $$0) {
      this.k = $$0.toUpperCase(Locale.ROOT);
      String $$1 = "gui.abuseReport.reason." + $$0;
      this.l = ws.c($$1);
      this.m = ws.c($$1 + ".description");
   }

   public String a() {
      return this.k;
   }

   public ws b() {
      return this.l;
   }

   public ws c() {
      return this.m;
   }
}
