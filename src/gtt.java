import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.Reader;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gtt extends aut<gtt.a> {
   public static final gsi a = new gsi("minecraft:empty", bpt.a(1.0F), bpt.a(1.0F), 1, gsi.a.a, false, false, 16);
   public static final ale b = new ale("minecraft", "intentionally_empty");
   public static final gtu c = new gtu(b, null);
   public static final gsi d = new gsi(b.toString(), bpt.a(1.0F), bpt.a(1.0F), 1, gsi.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(xo.class, new xo.b(jw.b)).registerTypeAdapter(gsj.class, new gsk()).create();
   private static final TypeToken<Map<String, gsj>> h = new TypeToken<Map<String, gsj>>() {
   };
   private final Map<ale, gtu> i = Maps.newHashMap();
   private final gtq j;
   private final Map<ale, aum> k = new HashMap<>();

   public gtt(ffh $$0) {
      this.j = new gtq(this, $$0, aur.fromMap(this.k));
   }

   protected gtt.a a(auo $$0, bng $$1) {
      gtt.a $$2 = new gtt.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (aum $$5 : $$0.a(new ale($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gsj> $$7 = ayn.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gsj> $$8 : $$7.entrySet()) {
                     $$2.a(new ale($$3, $$8.getKey()), $$8.getValue());
                  }

                  $$1.c();
               } catch (RuntimeException var15) {
                  e.warn("Invalid {} in resourcepack: '{}'", new Object[]{"sounds.json", $$5.b(), var15});
               }

               $$1.c();
            }
         } catch (IOException var16) {
         }

         $$1.c();
      }

      $$1.b();
      return $$2;
   }

   protected void a(gtt.a $$0, auo $$1, bng $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aX) {
         for (ale $$3 : this.i.keySet()) {
            gtu $$4 = this.i.get($$3);
            if (!xr.b($$4.a()) && lp.b.d($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (ale $$5 : this.i.keySet()) {
            if (!lp.b.d($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   public exu b() {
      return this.j.i();
   }

   static boolean a(gsi $$0, ale $$1, aur $$2) {
      ale $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gtu a(ale $$0) {
      return this.i.get($$0);
   }

   public Collection<ale> d() {
      return this.i.keySet();
   }

   public void a(gsm $$0) {
      this.j.a($$0);
   }

   public void a(gsl $$0) {
      this.j.c($$0);
   }

   public void a(gsl $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(feo $$0) {
      this.j.a($$0);
   }

   public void e() {
      this.j.e();
   }

   public void f() {
      this.j.d();
   }

   public void g() {
      this.j.b();
   }

   public void h() {
      this.j.c();
   }

   public void a(boolean $$0) {
      this.j.a($$0);
   }

   public void i() {
      this.j.f();
   }

   public void a(awa $$0, float $$1) {
      if ($$0 == awa.a && $$1 <= 0.0F) {
         this.f();
      }

      this.j.a($$0, $$1);
   }

   public void b(gsl $$0) {
      this.j.a($$0);
   }

   public boolean c(gsl $$0) {
      return this.j.b($$0);
   }

   public void a(gts $$0) {
      this.j.a($$0);
   }

   public void b(gts $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable ale $$0, @Nullable awa $$1) {
      this.j.a($$0, $$1);
   }

   public String j() {
      return this.j.g();
   }

   public void k() {
      this.j.a();
   }

   protected static class a {
      final Map<ale, gtu> a = Maps.newHashMap();
      private Map<ale, aum> b = Map.of();

      void a(auo $$0) {
         this.b = gsi.a.a($$0);
      }

      void a(ale $$0, gsj $$1) {
         gtu $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gtt.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gtu($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         aur $$4 = aur.fromMap(this.b);

         for (final gsi $$5 : $$1.a()) {
            final ale $$6 = $$5.a();
            gtv<gsi> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gtt.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gtv<gsi>() {
                     @Override
                     public int e() {
                        gtu $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gsi a(azf $$0) {
                        gtu $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gtt.a;
                        } else {
                           gsi $$2 = $$1.a($$0);
                           return new gsi(
                              $$2.a().toString(), new bpz($$2.c(), $$5.c()), new bpz($$2.d(), $$5.d()), $$5.e(), gsi.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gtq $$0) {
                        gtu $$1 = a.this.a.get($$6);
                        if ($$1 != null) {
                           $$1.a($$0);
                        }
                     }
                  };
                  break;
               default:
                  throw new IllegalStateException("Unknown SoundEventRegistration type: " + $$5.f());
            }

            $$2.a($$8);
         }
      }

      public void a(Map<ale, gtu> $$0, Map<ale, aum> $$1, gtq $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<ale, gtu> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
