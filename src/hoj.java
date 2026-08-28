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

public class hoj {
   static final Map<String, hoj> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hoj> a = Codec.STRING.comapFlatMap($$0 -> {
      hoj $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hoj::a);
   private static final List<hol<?>> i = List.of(hol.a, hol.b, hol.c, hol.d, hol.e, hol.f, hol.g, hol.h, hol.m, hol.l);
   private static final List<hol<?>> j = Stream.concat(i.stream(), Stream.of(hol.i, hol.j, hol.k)).toList();
   public static final hoj b = a("world_loaded", "WorldLoaded").a(j).a(hol.n).a(hol.o).b();
   public static final hoj c = a("performance_metrics", "PerformanceMetrics").a(j).a(hol.r).a(hol.s).a(hol.t).a(hol.u).a(hol.v).a(hol.w).a().b();
   public static final hoj d = a("world_load_times", "WorldLoadTimes").a(j).a(hol.x).a(hol.y).a().b();
   public static final hoj e = a("world_unloaded", "WorldUnloaded").a(j).a(hol.p).a(hol.q).b();
   public static final hoj f = a("advancement_made", "AdvancementMade").a(j).a(hol.D).a(hol.E).a().b();
   public static final hoj g = a("game_load_times", "GameLoadTimes").a(i).a(hol.z).a(hol.A).a(hol.B).a(hol.C).a().b();
   private final String k;
   private final String l;
   private final List<hol<?>> m;
   private final boolean n;
   private final MapCodec<hof> o;

   hoj(String $$0, String $$1, List<hol<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hom.a($$2).xmap($$0x -> new hof(this, $$0x), hof::b);
   }

   public static hoj.a a(String $$0, String $$1) {
      return new hoj.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hol<?>> b() {
      return this.m;
   }

   public MapCodec<hof> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hom $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hol<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hol<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xm e() {
      return this.a("title");
   }

   public xm f() {
      return this.a("description");
   }

   private xm a(String $$0) {
      return wy.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<hoj> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hol<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hoj.a a(List<hol<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hoj.a a(hol<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hoj.a a() {
         this.d = true;
         return this;
      }

      public hoj b() {
         hoj $$0 = new hoj(this.a, this.b, List.copyOf(this.c), this.d);
         if (hoj.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
