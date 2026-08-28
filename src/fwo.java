public enum fwo {
   a(
      ald.b("advancements/box_obtained"),
      ald.b("advancements/task_frame_obtained"),
      ald.b("advancements/challenge_frame_obtained"),
      ald.b("advancements/goal_frame_obtained")
   ),
   b(
      ald.b("advancements/box_unobtained"),
      ald.b("advancements/task_frame_unobtained"),
      ald.b("advancements/challenge_frame_unobtained"),
      ald.b("advancements/goal_frame_unobtained")
   );

   private final ald c;
   private final ald d;
   private final ald e;
   private final ald f;

   private fwo(final ald $$0, final ald $$1, final ald $$2, final ald $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public ald a() {
      return this.c;
   }

   public ald a(ao $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
