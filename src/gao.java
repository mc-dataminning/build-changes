public enum gao {
   a(
      alk.b("advancements/box_obtained"),
      alk.b("advancements/task_frame_obtained"),
      alk.b("advancements/challenge_frame_obtained"),
      alk.b("advancements/goal_frame_obtained")
   ),
   b(
      alk.b("advancements/box_unobtained"),
      alk.b("advancements/task_frame_unobtained"),
      alk.b("advancements/challenge_frame_unobtained"),
      alk.b("advancements/goal_frame_unobtained")
   );

   private final alk c;
   private final alk d;
   private final alk e;
   private final alk f;

   private gao(final alk $$0, final alk $$1, final alk $$2, final alk $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public alk a() {
      return this.c;
   }

   public alk a(ap $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
