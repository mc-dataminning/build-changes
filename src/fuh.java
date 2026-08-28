public enum fuh {
   a(
      alz.b("advancements/box_obtained"),
      alz.b("advancements/task_frame_obtained"),
      alz.b("advancements/challenge_frame_obtained"),
      alz.b("advancements/goal_frame_obtained")
   ),
   b(
      alz.b("advancements/box_unobtained"),
      alz.b("advancements/task_frame_unobtained"),
      alz.b("advancements/challenge_frame_unobtained"),
      alz.b("advancements/goal_frame_unobtained")
   );

   private final alz c;
   private final alz d;
   private final alz e;
   private final alz f;

   private fuh(final alz $$0, final alz $$1, final alz $$2, final alz $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public alz a() {
      return this.c;
   }

   public alz a(an $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
