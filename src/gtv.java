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

public class gtv extends auu<gtv.a> {
   public static final gsk a = new gsk("minecraft:empty", bpv.a(1.0F), bpv.a(1.0F), 1, gsk.a.a, false, false, 16);
   public static final alf b = new alf("minecraft", "intentionally_empty");
   public static final gtw c = new gtw(b, null);
   public static final gsk d = new gsk(b.toString(), bpv.a(1.0F), bpv.a(1.0F), 1, gsk.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(xp.class, new xp.b(jw.b)).registerTypeAdapter(gsl.class, new gsm()).create();
   private static final TypeToken<Map<String, gsl>> h = new TypeToken<Map<String, gsl>>() {
   };
   private final Map<alf, gtw> i = Maps.newHashMap();
   private final gts j;
   private final Map<alf, aun> k = new HashMap<>();

   public gtv(ffj $$0) {
      this.j = new gts(this, $$0, aus.fromMap(this.k));
   }

   protected gtv.a a(aup $$0, bni $$1) {
      gtv.a $$2 = new gtv.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (aun $$5 : $$0.a(new alf($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gsl> $$7 = ayp.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gsl> $$8 : $$7.entrySet()) {
                     $$2.a(new alf($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(gtv.a $$0, aup $$1, bni $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aX) {
         for (alf $$3 : this.i.keySet()) {
            gtw $$4 = this.i.get($$3);
            if (!xs.b($$4.a()) && lp.b.d($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (alf $$5 : this.i.keySet()) {
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

   public exw b() {
      return this.j.i();
   }

   static boolean a(gsk $$0, alf $$1, aus $$2) {
      alf $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gtw a(alf $$0) {
      return this.i.get($$0);
   }

   public Collection<alf> d() {
      return this.i.keySet();
   }

   public void a(gso $$0) {
      this.j.a($$0);
   }

   public void a(gsn $$0) {
      this.j.c($$0);
   }

   public void a(gsn $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(feq $$0) {
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

   public void a(awb $$0, float $$1) {
      if ($$0 == awb.a && $$1 <= 0.0F) {
         this.f();
      }

      this.j.a($$0, $$1);
   }

   public void b(gsn $$0) {
      this.j.a($$0);
   }

   public boolean c(gsn $$0) {
      return this.j.b($$0);
   }

   public void a(gtu $$0) {
      this.j.a($$0);
   }

   public void b(gtu $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable alf $$0, @Nullable awb $$1) {
      this.j.a($$0, $$1);
   }

   public String j() {
      return this.j.g();
   }

   public void k() {
      this.j.a();
   }

   protected static class a {
      final Map<alf, gtw> a = Maps.newHashMap();
      private Map<alf, aun> b = Map.of();

      void a(aup $$0) {
         this.b = gsk.a.a($$0);
      }

      void a(alf $$0, gsl $$1) {
         gtw $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gtv.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gtw($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         aus $$4 = aus.fromMap(this.b);

         for (final gsk $$5 : $$1.a()) {
            final alf $$6 = $$5.a();
            gtx<gsk> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gtv.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gtx<gsk>() {
                     @Override
                     public int e() {
                        gtw $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gsk a(azh $$0) {
                        gtw $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gtv.a;
                        } else {
                           gsk $$2 = $$1.a($$0);
                           return new gsk(
                              $$2.a().toString(), new bqb($$2.c(), $$5.c()), new bqb($$2.d(), $$5.d()), $$5.e(), gsk.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gts $$0) {
                        gtw $$1 = a.this.a.get($$6);
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

      public void a(Map<alf, gtw> $$0, Map<alf, aun> $$1, gts $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<alf, gtw> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
