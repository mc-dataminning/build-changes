import javax.annotation.Nullable;

public enum glm {
   a("generic_violation"),
   b("false_reporting"),
   c("hate_speech"),
   d("hate_terrorism_notorious_figure"),
   e("harassment_or_bullying"),
   f("defamation_impersonation_false_information"),
   g("drugs"),
   h("fraud"),
   i("spam_or_advertising"),
   j("nudity_or_pornography"),
   k("sexually_inappropriate"),
   l("extreme_violence_or_gore"),
   m("imminent_harm_to_person_or_property");

   private final wy n;

   private glm(final String $$0) {
      this.n = wy.c("gui.banned.reason." + $$0);
   }

   public wy a() {
      return this.n;
   }

   @Nullable
   public static glm a(int $$0) {
      return switch ($$0) {
         case 2 -> b;
         default -> null;
         case 5 -> c;
         case 16, 25 -> d;
         case 17, 19, 23, 31 -> a;
         case 21 -> e;
         case 27 -> f;
         case 28 -> g;
         case 29 -> h;
         case 30 -> i;
         case 32 -> j;
         case 33 -> k;
         case 34 -> l;
         case 53 -> m;
      };
   }
}
