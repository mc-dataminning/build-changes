public enum gam {
   a(
      ali.b("advancements/box_obtained"),
      ali.b("advancements/task_frame_obtained"),
      ali.b("advancements/challenge_frame_obtained"),
      ali.b("advancements/goal_frame_obtained")
   ),
   b(
      ali.b("advancements/box_unobtained"),
      ali.b("advancements/task_frame_unobtained"),
      ali.b("advancements/challenge_frame_unobtained"),
      ali.b("advancements/goal_frame_unobtained")
   );

   private final ali c;
   private final ali d;
   private final ali e;
   private final ali f;

   private gam(final ali $$0, final ali $$1, final ali $$2, final ali $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public ali a() {
      return this.c;
   }

   public ali a(ap $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
