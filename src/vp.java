public class vp implements uo<ur> {
   private static final int s = 1048576;
   public static final acq a = new acq("brand");
   public static final acq b = new acq("debug/path");
   public static final acq c = new acq("debug/neighbors_update");
   public static final acq d = new acq("debug/structures");
   public static final acq e = new acq("debug/worldgen_attempt");
   public static final acq f = new acq("debug/poi_ticket_count");
   public static final acq g = new acq("debug/poi_added");
   public static final acq h = new acq("debug/poi_removed");
   public static final acq i = new acq("debug/village_sections");
   public static final acq j = new acq("debug/goal_selector");
   public static final acq k = new acq("debug/brain");
   public static final acq l = new acq("debug/bee");
   public static final acq m = new acq("debug/hive");
   public static final acq n = new acq("debug/game_test_add_marker");
   public static final acq o = new acq("debug/game_test_clear");
   public static final acq p = new acq("debug/raids");
   public static final acq q = new acq("debug/game_event");
   public static final acq r = new acq("debug/game_event_listeners");
   private final acq t;
   private final sf u;

   public vp(acq $$0, sf $$1) {
      this.t = $$0;
      this.u = $$1;
      if ($$1.writerIndex() > 1048576) {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   public vp(sf $$0) {
      this.t = $$0.t();
      int $$1 = $$0.readableBytes();
      if ($$1 >= 0 && $$1 <= 1048576) {
         this.u = new sf($$0.readBytes($$1));
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.t);
      $$0.writeBytes(this.u.copy());
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public acq a() {
      return this.t;
   }

   public sf c() {
      return new sf(this.u.copy());
   }
}
