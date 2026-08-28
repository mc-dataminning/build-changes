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

public class hcj {
   static final Map<String, hcj> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hcj> a = Codec.STRING.comapFlatMap($$0 -> {
      hcj $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hcj::a);
   private static final List<hcl<?>> i = List.of(hcl.a, hcl.b, hcl.c, hcl.d, hcl.e, hcl.f, hcl.g, hcl.h, hcl.m, hcl.l);
   private static final List<hcl<?>> j = Stream.concat(i.stream(), Stream.of(hcl.i, hcl.j, hcl.k)).toList();
   public static final hcj b = a("world_loaded", "WorldLoaded").a(j).a(hcl.n).a(hcl.o).b();
   public static final hcj c = a("performance_metrics", "PerformanceMetrics").a(j).a(hcl.r).a(hcl.s).a(hcl.t).a(hcl.u).a(hcl.v).a(hcl.w).a().b();
   public static final hcj d = a("world_load_times", "WorldLoadTimes").a(j).a(hcl.x).a(hcl.y).a().b();
   public static final hcj e = a("world_unloaded", "WorldUnloaded").a(j).a(hcl.p).a(hcl.q).b();
   public static final hcj f = a("advancement_made", "AdvancementMade").a(j).a(hcl.D).a(hcl.E).a().b();
   public static final hcj g = a("game_load_times", "GameLoadTimes").a(i).a(hcl.z).a(hcl.A).a(hcl.B).a(hcl.C).a().b();
   private final String k;
   private final String l;
   private final List<hcl<?>> m;
   private final boolean n;
   private final MapCodec<hcf> o;

   hcj(String $$0, String $$1, List<hcl<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hcm.a($$2).xmap($$0x -> new hcf(this, $$0x), hcf::b);
   }

   public static hcj.a a(String $$0, String $$1) {
      return new hcj.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hcl<?>> b() {
      return this.m;
   }

   public MapCodec<hcf> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hcm $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hcl<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hcl<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xr e() {
      return this.a("title");
   }

   public xr f() {
      return this.a("description");
   }

   private xr a(String $$0) {
      return xd.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<hcj> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hcl<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hcj.a a(List<hcl<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hcj.a a(hcl<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hcj.a a() {
         this.d = true;
         return this;
      }

      public hcj b() {
         hcj $$0 = new hcj(this.a, this.b, List.copyOf(this.c), this.d);
         if (hcj.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
