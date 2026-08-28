public enum fut {
   a(
      akv.b("advancements/box_obtained"),
      akv.b("advancements/task_frame_obtained"),
      akv.b("advancements/challenge_frame_obtained"),
      akv.b("advancements/goal_frame_obtained")
   ),
   b(
      akv.b("advancements/box_unobtained"),
      akv.b("advancements/task_frame_unobtained"),
      akv.b("advancements/challenge_frame_unobtained"),
      akv.b("advancements/goal_frame_unobtained")
   );

   private final akv c;
   private final akv d;
   private final akv e;
   private final akv f;

   private fut(final akv $$0, final akv $$1, final akv $$2, final akv $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public akv a() {
      return this.c;
   }

   public akv a(ao $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
