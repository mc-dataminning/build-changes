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

public class guq {
   static final Map<String, guq> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<guq> a = Codec.STRING.comapFlatMap($$0 -> {
      guq $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, guq::a);
   private static final List<gus<?>> i = List.of(gus.a, gus.b, gus.c, gus.d, gus.e, gus.f, gus.g, gus.h, gus.m, gus.l);
   private static final List<gus<?>> j = Stream.concat(i.stream(), Stream.of(gus.i, gus.j, gus.k)).toList();
   public static final guq b = a("world_loaded", "WorldLoaded").a(j).a(gus.n).a(gus.o).b();
   public static final guq c = a("performance_metrics", "PerformanceMetrics").a(j).a(gus.r).a(gus.s).a(gus.t).a(gus.u).a(gus.v).a(gus.w).a().b();
   public static final guq d = a("world_load_times", "WorldLoadTimes").a(j).a(gus.x).a(gus.y).a().b();
   public static final guq e = a("world_unloaded", "WorldUnloaded").a(j).a(gus.p).a(gus.q).b();
   public static final guq f = a("advancement_made", "AdvancementMade").a(j).a(gus.D).a(gus.E).a().b();
   public static final guq g = a("game_load_times", "GameLoadTimes").a(i).a(gus.z).a(gus.A).a(gus.B).a(gus.C).a().b();
   private final String k;
   private final String l;
   private final List<gus<?>> m;
   private final boolean n;
   private final MapCodec<gum> o;

   guq(String $$0, String $$1, List<gus<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gut.a($$2).xmap($$0x -> new gum(this, $$0x), gum::b);
   }

   public static guq.a a(String $$0, String $$1) {
      return new guq.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gus<?>> b() {
      return this.m;
   }

   public MapCodec<gum> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gut $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gus<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gus<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xi e() {
      return this.a("title");
   }

   public xi f() {
      return this.a("description");
   }

   private xi a(String $$0) {
      return wu.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<guq> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gus<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public guq.a a(List<gus<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> guq.a a(gus<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public guq.a a() {
         this.d = true;
         return this;
      }

      public guq b() {
         guq $$0 = new guq(this.a, this.b, List.copyOf(this.c), this.d);
         if (guq.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
