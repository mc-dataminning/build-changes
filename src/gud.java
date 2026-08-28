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

public class gud {
   static final Map<String, gud> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gud> a = Codec.STRING.comapFlatMap($$0 -> {
      gud $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gud::a);
   private static final List<guf<?>> i = List.of(guf.a, guf.b, guf.c, guf.d, guf.e, guf.f, guf.g, guf.h, guf.m, guf.l);
   private static final List<guf<?>> j = Stream.concat(i.stream(), Stream.of(guf.i, guf.j, guf.k)).toList();
   public static final gud b = a("world_loaded", "WorldLoaded").a(j).a(guf.n).a(guf.o).b();
   public static final gud c = a("performance_metrics", "PerformanceMetrics").a(j).a(guf.r).a(guf.s).a(guf.t).a(guf.u).a(guf.v).a(guf.w).a().b();
   public static final gud d = a("world_load_times", "WorldLoadTimes").a(j).a(guf.x).a(guf.y).a().b();
   public static final gud e = a("world_unloaded", "WorldUnloaded").a(j).a(guf.p).a(guf.q).b();
   public static final gud f = a("advancement_made", "AdvancementMade").a(j).a(guf.D).a(guf.E).a().b();
   public static final gud g = a("game_load_times", "GameLoadTimes").a(i).a(guf.z).a(guf.A).a(guf.B).a(guf.C).a().b();
   private final String k;
   private final String l;
   private final List<guf<?>> m;
   private final boolean n;
   private final MapCodec<gtz> o;

   gud(String $$0, String $$1, List<guf<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gug.a($$2).xmap($$0x -> new gtz(this, $$0x), gtz::b);
   }

   public static gud.a a(String $$0, String $$1) {
      return new gud.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<guf<?>> b() {
      return this.m;
   }

   public MapCodec<gtz> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gug $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (guf<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(guf<T> $$0) {
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

   public static List<gud> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<guf<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gud.a a(List<guf<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gud.a a(guf<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gud.a a() {
         this.d = true;
         return this;
      }

      public gud b() {
         gud $$0 = new gud(this.a, this.b, List.copyOf(this.c), this.d);
         if (gud.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
