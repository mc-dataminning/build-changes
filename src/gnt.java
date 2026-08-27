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

public class gnt extends ast<gnt.a> {
   public static final gmm a = new gmm("minecraft:empty", bme.a(1.0F), bme.a(1.0F), 1, gmm.a.a, false, false, 16);
   public static final ajh b = new ajh("minecraft", "intentionally_empty");
   public static final gnu c = new gnu(b, null);
   public static final gmm d = new gmm(b.toString(), bme.a(1.0F), bme.a(1.0F), 1, gmm.a.a, false, false, 16);
   static final Logger e = LogUtils.getLogger();
   private static final String f = "sounds.json";
   private static final Gson g = new GsonBuilder().registerTypeHierarchyAdapter(vu.class, new vu.b()).registerTypeAdapter(gmn.class, new gmo()).create();
   private static final TypeToken<Map<String, gmn>> h = new TypeToken<Map<String, gmn>>() {
   };
   private final Map<ajh, gnu> i = Maps.newHashMap();
   private final gnq j;
   private final Map<ajh, asm> k = new HashMap<>();

   public gnt(ezm $$0) {
      this.j = new gnq(this, $$0, asr.fromMap(this.k));
   }

   protected gnt.a a(aso $$0, bjr $$1) {
      gnt.a $$2 = new gnt.a();
      $$1.a();
      $$1.a("list");
      $$2.a($$0);
      $$1.c();

      for (String $$3 : $$0.a()) {
         $$1.a($$3);

         try {
            for (asm $$5 : $$0.a(new ajh($$3, "sounds.json"))) {
               $$1.a($$5.b());

               try (Reader $$6 = $$5.e()) {
                  $$1.a("parse");
                  Map<String, gmn> $$7 = awm.a(g, $$6, h);
                  $$1.b("register");

                  for (Entry<String, gmn> $$8 : $$7.entrySet()) {
                     $$2.a(new ajh($$3, $$8.getKey()), $$8.getValue());
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

   protected void a(gnt.a $$0, aso $$1, bjr $$2) {
      $$0.a(this.i, this.k, this.j);
      if (aa.aW) {
         for (ajh $$3 : this.i.keySet()) {
            gnu $$4 = this.i.get($$3);
            if (!vx.b($$4.a()) && ki.b.d($$3)) {
               e.error("Missing subtitle {} for sound event: {}", $$4.a(), $$3);
            }
         }
      }

      if (e.isDebugEnabled()) {
         for (ajh $$5 : this.i.keySet()) {
            if (!ki.b.d($$5)) {
               e.debug("Not having sound event for: {}", $$5);
            }
         }
      }

      this.j.a();
   }

   public List<String> a() {
      return this.j.h();
   }

   public ery b() {
      return this.j.i();
   }

   static boolean a(gmm $$0, ajh $$1, asr $$2) {
      ajh $$3 = $$0.b();
      if ($$2.getResource($$3).isEmpty()) {
         e.warn("File {} does not exist, cannot add it to event {}", $$3, $$1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public gnu a(ajh $$0) {
      return this.i.get($$0);
   }

   public Collection<ajh> d() {
      return this.i.keySet();
   }

   public void a(gmq $$0) {
      this.j.a($$0);
   }

   public void a(gmp $$0) {
      this.j.c($$0);
   }

   public void a(gmp $$0, int $$1) {
      this.j.a($$0, $$1);
   }

   public void a(eyt $$0) {
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

   public void a(atz $$0, float $$1) {
      if ($$0 == atz.a && $$1 <= 0.0F) {
         this.f();
      }

      this.j.a($$0, $$1);
   }

   public void b(gmp $$0) {
      this.j.a($$0);
   }

   public boolean c(gmp $$0) {
      return this.j.b($$0);
   }

   public void a(gns $$0) {
      this.j.a($$0);
   }

   public void b(gns $$0) {
      this.j.b($$0);
   }

   public void a(@Nullable ajh $$0, @Nullable atz $$1) {
      this.j.a($$0, $$1);
   }

   public String j() {
      return this.j.g();
   }

   public void k() {
      this.j.a();
   }

   protected static class a {
      final Map<ajh, gnu> a = Maps.newHashMap();
      private Map<ajh, asm> b = Map.of();

      void a(aso $$0) {
         this.b = gmm.a.a($$0);
      }

      void a(ajh $$0, gmn $$1) {
         gnu $$2 = this.a.get($$0);
         boolean $$3 = $$2 == null;
         if ($$3 || $$1.b()) {
            if (!$$3) {
               gnt.e.debug("Replaced sound event location {}", $$0);
            }

            $$2 = new gnu($$0, $$1.c());
            this.a.put($$0, $$2);
         }

         asr $$4 = asr.fromMap(this.b);

         for (final gmm $$5 : $$1.a()) {
            final ajh $$6 = $$5.a();
            gnv<gmm> $$8;
            switch ($$5.f()) {
               case a:
                  if (!gnt.a($$5, $$0, $$4)) {
                     continue;
                  }

                  $$8 = $$5;
                  break;
               case b:
                  $$8 = new gnv<gmm>() {
                     @Override
                     public int e() {
                        gnu $$0 = a.this.a.get($$6);
                        return $$0 == null ? 0 : $$0.e();
                     }

                     public gmm a(axd $$0) {
                        gnu $$1 = a.this.a.get($$6);
                        if ($$1 == null) {
                           return gnt.a;
                        } else {
                           gmm $$2 = $$1.a($$0);
                           return new gmm(
                              $$2.a().toString(), new bmk($$2.c(), $$5.c()), new bmk($$2.d(), $$5.d()), $$5.e(), gmm.a.a, $$2.g() || $$5.g(), $$2.h(), $$2.i()
                           );
                        }
                     }

                     @Override
                     public void a(gnq $$0) {
                        gnu $$1 = a.this.a.get($$6);
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

      public void a(Map<ajh, gnu> $$0, Map<ajh, asm> $$1, gnq $$2) {
         $$0.clear();
         $$1.clear();
         $$1.putAll(this.b);

         for (Entry<ajh, gnu> $$3 : this.a.entrySet()) {
            $$0.put($$3.getKey(), $$3.getValue());
            $$3.getValue().a($$2);
         }
      }
   }
}
