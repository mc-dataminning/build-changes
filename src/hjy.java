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

public class hjy {
   static final Map<String, hjy> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hjy> a = Codec.STRING.comapFlatMap($$0 -> {
      hjy $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hjy::a);
   private static final List<hka<?>> i = List.of(hka.a, hka.b, hka.c, hka.d, hka.e, hka.f, hka.g, hka.h, hka.m, hka.l);
   private static final List<hka<?>> j = Stream.concat(i.stream(), Stream.of(hka.i, hka.j, hka.k)).toList();
   public static final hjy b = a("world_loaded", "WorldLoaded").a(j).a(hka.n).a(hka.o).b();
   public static final hjy c = a("performance_metrics", "PerformanceMetrics").a(j).a(hka.r).a(hka.s).a(hka.t).a(hka.u).a(hka.v).a(hka.w).a().b();
   public static final hjy d = a("world_load_times", "WorldLoadTimes").a(j).a(hka.x).a(hka.y).a().b();
   public static final hjy e = a("world_unloaded", "WorldUnloaded").a(j).a(hka.p).a(hka.q).b();
   public static final hjy f = a("advancement_made", "AdvancementMade").a(j).a(hka.D).a(hka.E).a().b();
   public static final hjy g = a("game_load_times", "GameLoadTimes").a(i).a(hka.z).a(hka.A).a(hka.B).a(hka.C).a().b();
   private final String k;
   private final String l;
   private final List<hka<?>> m;
   private final boolean n;
   private final MapCodec<hju> o;

   hjy(String $$0, String $$1, List<hka<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hkb.a($$2).xmap($$0x -> new hju(this, $$0x), hju::b);
   }

   public static hjy.a a(String $$0, String $$1) {
      return new hjy.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hka<?>> b() {
      return this.m;
   }

   public MapCodec<hju> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hkb $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hka<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hka<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xc e() {
      return this.a("title");
   }

   public xc f() {
      return this.a("description");
   }

   private xc a(String $$0) {
      return wo.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<hjy> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hka<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hjy.a a(List<hka<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hjy.a a(hka<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hjy.a a() {
         this.d = true;
         return this;
      }

      public hjy b() {
         hjy $$0 = new hjy(this.a, this.b, List.copyOf(this.c), this.d);
         if (hjy.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
