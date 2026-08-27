import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class gjl {
   static final Map<String, gjl> h = new Object2ObjectLinkedOpenHashMap();
   public static final Codec<gjl> a = Codec.STRING.comapFlatMap($$0 -> {
      gjl $$1 = h.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
   }, gjl::a);
   private static final List<gjn<?>> i = List.of(gjn.a, gjn.b, gjn.c, gjn.d, gjn.e, gjn.f, gjn.g, gjn.h, gjn.m, gjn.l);
   private static final List<gjn<?>> j = Stream.concat(i.stream(), Stream.of(gjn.i, gjn.j, gjn.k)).toList();
   public static final gjl b = a("world_loaded", "WorldLoaded").a(j).a(gjn.n).a(gjn.o).b();
   public static final gjl c = a("performance_metrics", "PerformanceMetrics").a(j).a(gjn.r).a(gjn.s).a(gjn.t).a(gjn.u).a(gjn.v).a(gjn.w).a().b();
   public static final gjl d = a("world_load_times", "WorldLoadTimes").a(j).a(gjn.x).a(gjn.y).a().b();
   public static final gjl e = a("world_unloaded", "WorldUnloaded").a(j).a(gjn.p).a(gjn.q).b();
   public static final gjl f = a("advancement_made", "AdvancementMade").a(j).a(gjn.D).a(gjn.E).a().b();
   public static final gjl g = a("game_load_times", "GameLoadTimes").a(i).a(gjn.z).a(gjn.A).a(gjn.B).a(gjn.C).a().b();
   private final String k;
   private final String l;
   private final List<gjn<?>> m;
   private final boolean n;
   private final Codec<gjh> o;

   gjl(String $$0, String $$1, List<gjn<?>> $$2, boolean $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = gjo.a($$2).xmap($$0x -> new gjh(this, $$0x), gjh::b);
   }

   public static gjl.a a(String $$0, String $$1) {
      return new gjl.a($$0, $$1);
   }

   public String a() {
      return this.k;
   }

   public List<gjn<?>> b() {
      return this.m;
   }

   public Codec<gjh> c() {
      return this.o;
   }

   public boolean d() {
      return this.n;
   }

   public TelemetryEvent a(TelemetrySession $$0, gjo $$1) {
      TelemetryEvent $$2 = $$0.createNewEvent(this.l);

      for (gjn<?> $$3 : this.m) {
         $$3.a($$1, $$2);
      }

      return $$2;
   }

   public <T> boolean a(gjn<T> $$0) {
      return this.m.contains($$0);
   }

   @Override
   public String toString() {
      return "TelemetryEventType[" + this.k + "]";
   }

   public vt e() {
      return this.a("title");
   }

   public vt f() {
      return this.a("description");
   }

   private vt a(String $$0) {
      return vf.c("telemetry.event." + this.k + "." + $$0);
   }

   public static List<gjl> g() {
      return List.copyOf(h.values());
   }

   public static class a {
      private final String a;
      private final String b;
      private final List<gjn<?>> c = new ArrayList<>();
      private boolean d;

      a(String $$0, String $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public gjl.a a(List<gjn<?>> $$0) {
         this.c.addAll($$0);
         return this;
      }

      public <T> gjl.a a(gjn<T> $$0) {
         this.c.add($$0);
         return this;
      }

      public gjl.a a() {
         this.d = true;
         return this;
      }

      public gjl b() {
         gjl $$0 = new gjl(this.a, this.b, List.copyOf(this.c), this.d);
         if (gjl.h.putIfAbsent(this.a, $$0) != null) {
            throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
         } else {
            return $$0;
         }
      }
   }
}
