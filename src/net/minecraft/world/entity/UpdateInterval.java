package net.minecraft.world.entity;

public interface UpdateInterval {
   UpdateInterval NEVER = new UpdateInterval() {
      @Override
      public boolean test(final int tick) {
         return false;
      }

      @Override
      public int nextInterval(final int tick) {
         return 0;
      }
   };

   boolean test(int tick);

   int nextInterval(int tick);

   static UpdateInterval periodic(final int period) {
      return new UpdateInterval() {
         @Override
         public boolean test(final int tick) {
            return tick % period == 0;
         }

         @Override
         public int nextInterval(final int tick) {
            return tick / period * period + period;
         }
      };
   }
}
