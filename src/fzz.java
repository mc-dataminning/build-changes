public enum fzz {
   a(
      alr.b("advancements/box_obtained"),
      alr.b("advancements/task_frame_obtained"),
      alr.b("advancements/challenge_frame_obtained"),
      alr.b("advancements/goal_frame_obtained")
   ),
   b(
      alr.b("advancements/box_unobtained"),
      alr.b("advancements/task_frame_unobtained"),
      alr.b("advancements/challenge_frame_unobtained"),
      alr.b("advancements/goal_frame_unobtained")
   );

   private final alr c;
   private final alr d;
   private final alr e;
   private final alr f;

   private fzz(final alr $$0, final alr $$1, final alr $$2, final alr $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public alr a() {
      return this.c;
   }

   public alr a(ap $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
