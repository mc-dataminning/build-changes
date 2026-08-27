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

public class gvq extends aui<gvq.a> {
   public static final guj a = new guj("minecraft:empty", bpb.a(1.0F), bpb.a(1.0F), 1, guj.a.a, false, false, 16);
   public static final akt b = new akt("minecraft", "intentionally_empty");
   public static final gvr c = new gvr(b, null);
   public static final guj d = new guj(b.toString(), bpb.a(1.0F), bpb.a(1.0F), 1, guj.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(xe.class, new xe.b(jo.b)).registerTypeAdapter(guk.class, new gul()).create();
   private static final TypeToken<Map<String, guk>> h = new TypeToken<Map<String, guk>>() {
   };
   private final Map<akt, gvr> i = Maps.newHashMap();
   private final gvn j;
   private final Map<akt, aub> k = new HashMap<>();

   public gvq(fgn $$0) {
      this.j = new gvn(this, $$0, aug.fromMap(this.k));
   }

   protected gvq.a a(aud $$0, bmo $$1) {
      gvq.a $$2 = new gvq.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (aub $$5 : $$0.a(new akt($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, guk> $$7 = ayc.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, guk> $$8 : $$7.entrySet()) {
                     $$2.a(new akt($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(gvq.a $$0, aud $$1, bmo $$2) {
      $$0.a(this.i, this.k, this.j);
      if (ab.aX) {
         for (akt $$3 : this.i.keySet()) {
            gvr $$4 = this.i.get($$3);
            if (!xh.b($$4.a()) && lh.b.d($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (akt $$5 : this.i.keySet()) {
            if (!lh.b.d($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   public eyz b() {
      return this.j.i();
   }

   static boolean a(guj $$0, akt $$1, aug $$2) {
      akt $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gvr a(akt $$0) {
      return this.i.get($$0);
   }

   public Collection<akt> d() {
      return this.i.keySet();
   }

   public void a(gun $$0) {
      this.j.a($$0);
   }

   public void a(gum $$0) {
      this.j.c($$0);
   }

   public void a(gum $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(ffu $$0) {
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

   public void a(avq $$0, float $$1) {
      if ($$0 == avq.a && $$1 <= 0.0F) {
         this.f();
      }

      this.j.a($$0, $$1);
   }

   public void b(gum $$0) {
      this.j.a($$0);
   }

   public boolean c(gum $$0) {
      return this.j.b($$0);
   }

   public void a(gvp $$0) {
      this.j.a($$0);
   }

   public void b(gvp $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable akt $$0, @Nullable avq $$1) {
      this.j.a($$0, $$1);
   }

   public String j() {
      return this.j.g();
   }

   public void k() {
      this.j.a();
   }

   protected static class a {
      final Map<akt, gvr> a = Maps.newHashMap();
      private Map<akt, aub> b = Map.of();

      void a(aud $$0) {
         this.b = guj.a.a($$0);
      }

      void a(akt $$0, guk $$1) {
         gvr $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gvq.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gvr($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         aug $$4 = aug.fromMap(this.b);

         for (final guj $$5 : $$1.a()) {
            final akt $$6 = $$5.a();
            gvs<guj> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gvq.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gvs<guj>() {
                     @Override
                     public int e() {
                        gvr $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public guj a(ayt $$0) {
                        gvr $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gvq.a;
                        } else {
                           guj $$2 = $$1.a($$0);
                           return new guj(
                              $$2.a().toString(), new bph($$2.c(), $$5.c()), new bph($$2.d(), $$5.d()), $$5.e(), guj.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gvn $$0) {
                        gvr $$1 = a.this.a.get($$6);
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

      public void a(Map<akt, gvr> $$0, Map<akt, aub> $$1, gvn $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<akt, gvr> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
