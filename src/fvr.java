public enum fvr {
   a(
      aku.b("advancements/box_obtained"),
      aku.b("advancements/task_frame_obtained"),
      aku.b("advancements/challenge_frame_obtained"),
      aku.b("advancements/goal_frame_obtained")
   ),
   b(
      aku.b("advancements/box_unobtained"),
      aku.b("advancements/task_frame_unobtained"),
      aku.b("advancements/challenge_frame_unobtained"),
      aku.b("advancements/goal_frame_unobtained")
   );

   private final aku c;
   private final aku d;
   private final aku e;
   private final aku f;

   private fvr(final aku $$0, final aku $$1, final aku $$2, final aku $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public aku a() {
      return this.c;
   }

   public aku a(ao $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
