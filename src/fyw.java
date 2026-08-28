public enum fyw {
   a(
      alg.b("advancements/box_obtained"),
      alg.b("advancements/task_frame_obtained"),
      alg.b("advancements/challenge_frame_obtained"),
      alg.b("advancements/goal_frame_obtained")
   ),
   b(
      alg.b("advancements/box_unobtained"),
      alg.b("advancements/task_frame_unobtained"),
      alg.b("advancements/challenge_frame_unobtained"),
      alg.b("advancements/goal_frame_unobtained")
   );

   private final alg c;
   private final alg d;
   private final alg e;
   private final alg f;

   private fyw(final alg $$0, final alg $$1, final alg $$2, final alg $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public alg a() {
      return this.c;
   }

   public alg a(ap $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
