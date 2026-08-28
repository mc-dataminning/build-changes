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

public class hgw {
   static final Map<String, hgw> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hgw> a = Codec.STRING.comapFlatMap($$0 -> {
      hgw $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hgw::a);
   private static final List<hgy<?>> i = List.of(hgy.a, hgy.b, hgy.c, hgy.d, hgy.e, hgy.f, hgy.g, hgy.h, hgy.m, hgy.l);
   private static final List<hgy<?>> j = Stream.concat(i.stream(), Stream.of(hgy.i, hgy.j, hgy.k)).toList();
   public static final hgw b = a("world_loaded", "WorldLoaded").a(j).a(hgy.n).a(hgy.o).b();
   public static final hgw c = a("performance_metrics", "PerformanceMetrics").a(j).a(hgy.r).a(hgy.s).a(hgy.t).a(hgy.u).a(hgy.v).a(hgy.w).a().b();
   public static final hgw d = a("world_load_times", "WorldLoadTimes").a(j).a(hgy.x).a(hgy.y).a().b();
   public static final hgw e = a("world_unloaded", "WorldUnloaded").a(j).a(hgy.p).a(hgy.q).b();
   public static final hgw f = a("advancement_made", "AdvancementMade").a(j).a(hgy.D).a(hgy.E).a().b();
   public static final hgw g = a("game_load_times", "GameLoadTimes").a(i).a(hgy.z).a(hgy.A).a(hgy.B).a(hgy.C).a().b();
   private final String k;
   private final String l;
   private final List<hgy<?>> m;
   private final boolean n;
   private final MapCodec<hgs> o;

   hgw(String $$0, String $$1, List<hgy<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hgz.a($$2).xmap($$0x -> new hgs(this, $$0x), hgs::b);
   }

   public static hgw.a a(String $$0, String $$1) {
      return new hgw.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hgy<?>> b() {
      return this.m;
   }

   public MapCodec<hgs> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hgz $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hgy<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hgy<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public yj e() {
      return this.a("title");
   }

   public yj f() {
      return this.a("description");
   }

   private yj a(String $$0) {
      return xv.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<hgw> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hgy<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hgw.a a(List<hgy<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hgw.a a(hgy<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hgw.a a() {
         this.d = true;
         return this;
      }

      public hgw b() {
         hgw $$0 = new hgw(this.a, this.b, List.copyOf(this.c), this.d);
         if (hgw.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
