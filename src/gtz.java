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

public class gtz {
   static final Map<String, gtz> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gtz> a = Codec.STRING.comapFlatMap($$0 -> {
      gtz $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gtz::a);
   private static final List<gub<?>> i = List.of(gub.a, gub.b, gub.c, gub.d, gub.e, gub.f, gub.g, gub.h, gub.m, gub.l);
   private static final List<gub<?>> j = Stream.concat(i.stream(), Stream.of(gub.i, gub.j, gub.k)).toList();
   public static final gtz b = a("world_loaded", "WorldLoaded").a(j).a(gub.n).a(gub.o).b();
   public static final gtz c = a("performance_metrics", "PerformanceMetrics").a(j).a(gub.r).a(gub.s).a(gub.t).a(gub.u).a(gub.v).a(gub.w).a().b();
   public static final gtz d = a("world_load_times", "WorldLoadTimes").a(j).a(gub.x).a(gub.y).a().b();
   public static final gtz e = a("world_unloaded", "WorldUnloaded").a(j).a(gub.p).a(gub.q).b();
   public static final gtz f = a("advancement_made", "AdvancementMade").a(j).a(gub.D).a(gub.E).a().b();
   public static final gtz g = a("game_load_times", "GameLoadTimes").a(i).a(gub.z).a(gub.A).a(gub.B).a(gub.C).a().b();
   private final String k;
   private final String l;
   private final List<gub<?>> m;
   private final boolean n;
   private final MapCodec<gtv> o;

   gtz(String $$0, String $$1, List<gub<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = guc.a($$2).xmap($$0x -> new gtv(this, $$0x), gtv::b);
   }

   public static gtz.a a(String $$0, String $$1) {
      return new gtz.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gub<?>> b() {
      return this.m;
   }

   public MapCodec<gtv> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, guc $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gub<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gub<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xz e() {
      return this.a("title");
   }

   public xz f() {
      return this.a("description");
   }

   private xz a(String $$0) {
      return xl.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gtz> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gub<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gtz.a a(List<gub<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gtz.a a(gub<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gtz.a a() {
         this.d = true;
         return this;
      }

      public gtz b() {
         gtz $$0 = new gtz(this.a, this.b, List.copyOf(this.c), this.d);
         if (gtz.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
