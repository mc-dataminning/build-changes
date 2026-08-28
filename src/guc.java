import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class guc {
   static final Map<String, guc> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<guc> a = Codec.STRING.comapFlatMap($$0 -> {
      guc $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, guc::a);
   private static final List<gue<?>> i = List.of(gue.a, gue.b, gue.c, gue.d, gue.e, gue.f, gue.g, gue.h, gue.m, gue.l);
   private static final List<gue<?>> j = Stream.concat(i.stream(), Stream.of(gue.i, gue.j, gue.k)).toList();
   public static final guc b = a("world_loaded", "WorldLoaded").a(j).a(gue.n).a(gue.o).b();
   public static final guc c = a("performance_metrics", "PerformanceMetrics").a(j).a(gue.r).a(gue.s).a(gue.t).a(gue.u).a(gue.v).a(gue.w).a().b();
   public static final guc d = a("world_load_times", "WorldLoadTimes").a(j).a(gue.x).a(gue.y).a().b();
   public static final guc e = a("world_unloaded", "WorldUnloaded").a(j).a(gue.p).a(gue.q).b();
   public static final guc f = a("advancement_made", "AdvancementMade").a(j).a(gue.D).a(gue.E).a().b();
   public static final guc g = a("game_load_times", "GameLoadTimes").a(i).a(gue.z).a(gue.A).a(gue.B).a(gue.C).a().b();
   private final String k;
   private final String l;
   private final List<gue<?>> m;
   private final boolean n;
   private final MapCodec<gty> o;

   guc(String $$0, String $$1, List<gue<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = guf.a($$2).xmap($$0x -> new gty(this, $$0x), gty::b);
   }

   public static guc.a a(String $$0, String $$1) {
      return new guc.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gue<?>> b() {
      return this.m;
   }

   public MapCodec<gty> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, guf $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gue<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gue<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public yc e() {
      return this.a("title");
   }

   public yc f() {
      return this.a("description");
   }

   private yc a(String $$0) {
      return xo.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<guc> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gue<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public guc.a a(List<gue<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> guc.a a(gue<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public guc.a a() {
         this.d = true;
         return this;
      }

      public guc b() {
         guc $$0 = new guc(this.a, this.b, List.copyOf(this.c), this.d);
         if (guc.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
