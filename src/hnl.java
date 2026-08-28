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

public class hnl {
   static final Map<String, hnl> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<hnl> a = Codec.STRING.comapFlatMap($$0 -> {
      hnl $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, hnl::a);
   private static final List<hnn<?>> i = List.of(hnn.a, hnn.b, hnn.c, hnn.d, hnn.e, hnn.f, hnn.g, hnn.h, hnn.m, hnn.l);
   private static final List<hnn<?>> j = Stream.concat(i.stream(), Stream.of(hnn.i, hnn.j, hnn.k)).toList();
   public static final hnl b = a("world_loaded", "WorldLoaded").a(j).a(hnn.n).a(hnn.o).b();
   public static final hnl c = a("performance_metrics", "PerformanceMetrics").a(j).a(hnn.r).a(hnn.s).a(hnn.t).a(hnn.u).a(hnn.v).a(hnn.w).a().b();
   public static final hnl d = a("world_load_times", "WorldLoadTimes").a(j).a(hnn.x).a(hnn.y).a().b();
   public static final hnl e = a("world_unloaded", "WorldUnloaded").a(j).a(hnn.p).a(hnn.q).b();
   public static final hnl f = a("advancement_made", "AdvancementMade").a(j).a(hnn.D).a(hnn.E).a().b();
   public static final hnl g = a("game_load_times", "GameLoadTimes").a(i).a(hnn.z).a(hnn.A).a(hnn.B).a(hnn.C).a().b();
   private final String k;
   private final String l;
   private final List<hnn<?>> m;
   private final boolean n;
   private final MapCodec<hnh> o;

   hnl(String $$0, String $$1, List<hnn<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = hno.a($$2).xmap($$0x -> new hnh(this, $$0x), hnh::b);
   }

   public static hnl.a a(String $$0, String $$1) {
      return new hnl.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<hnn<?>> b() {
      return this.m;
   }

   public MapCodec<hnh> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, hno $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (hnn<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(hnn<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public xk e() {
      return this.a("title");
   }

   public xk f() {
      return this.a("description");
   }

   private xk a(String $$0) {
      return ww.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<hnl> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<hnn<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public hnl.a a(List<hnn<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> hnl.a a(hnn<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public hnl.a a() {
         this.d = true;
         return this;
      }

      public hnl b() {
         hnl $$0 = new hnl(this.a, this.b, List.copyOf(this.c), this.d);
         if (hnl.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
