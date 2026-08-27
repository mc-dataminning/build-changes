import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class gij {
   static final Map<String, gij> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gij> a = Codec.STRING.comapFlatMap($$0 -> {
      gij $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gij::a);
   private static final List<gil<?>> i = List.of(gil.a, gil.b, gil.c, gil.d, gil.e, gil.f, gil.g, gil.h, gil.m, gil.l);
   private static final List<gil<?>> j = Stream.concat(i.stream(), Stream.of(gil.i, gil.j, gil.k)).toList();
   public static final gij b = a("world_loaded", "WorldLoaded").a(j).a(gil.n).a(gil.o).b();
   public static final gij c = a("performance_metrics", "PerformanceMetrics").a(j).a(gil.r).a(gil.s).a(gil.t).a(gil.u).a(gil.v).a(gil.w).a().b();
   public static final gij d = a("world_load_times", "WorldLoadTimes").a(j).a(gil.x).a(gil.y).a().b();
   public static final gij e = a("world_unloaded", "WorldUnloaded").a(j).a(gil.p).a(gil.q).b();
   public static final gij f = a("advancement_made", "AdvancementMade").a(j).a(gil.D).a(gil.E).a().b();
   public static final gij g = a("game_load_times", "GameLoadTimes").a(i).a(gil.z).a(gil.A).a(gil.B).a(gil.C).a().b();
   private final String k;
   private final String l;
   private final List<gil<?>> m;
   private final boolean n;
   private final Codec<gif> o;

   gij(String $$0, String $$1, List<gil<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gim.a($$2).xmap($$0x -> new gif(this, $$0x), gif::b);
   }

   public static gij.a a(String $$0, String $$1) {
      return new gij.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gil<?>> b() {
      return this.m;
   }

   public Codec<gif> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gim $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gil<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gil<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public vp e() {
      return this.a("title");
   }

   public vp f() {
      return this.a("description");
   }

   private vp a(String $$0) {
      return vb.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gij> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gil<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gij.a a(List<gil<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gij.a a(gil<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gij.a a() {
         this.d = true;
         return this;
      }

      public gij b() {
         gij $$0 = new gij(this.a, this.b, List.copyOf(this.c), this.d);
         if (gij.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
