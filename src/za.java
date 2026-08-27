import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import io.netty.buffer.Unpooled;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class za {
   private static final Logger a = LogUtils.getLogger();

   public static void a(aif $$0, gu $$1, String $$2, int $$3, int $$4) {
      sf $$5 = new sf(Unpooled.buffer());
      $$5.a($$1);
      $$5.writeInt($$3);
      $$5.a($$2);
      $$5.writeInt($$4);
      a($$0, $$5, vp.n);
   }

   public static void a(aif $$0) {
      sf $$1 = new sf(Unpooled.buffer());
      a($$0, $$1, vp.o);
   }

   public static void a(aif $$0, clt $$1) {
   }

   public static void a(aif $$0, gu $$1) {
      d($$0, $$1);
   }

   public static void b(aif $$0, gu $$1) {
      d($$0, $$1);
   }

   public static void c(aif $$0, gu $$1) {
      d($$0, $$1);
   }

   private static void d(aif $$0, gu $$1) {
   }

   public static void a(cmm $$0, bgb $$1, @Nullable dxt $$2, float $$3) {
   }

   public static void a(cmm $$0, gu $$1) {
   }

   public static void a(cng $$0, dsi $$1) {
   }

   public static void a(cmm $$0, bgb $$1, bmw $$2) {
      if ($$0 instanceof aif) {
         ;
      }
   }

   public static void a(aif $$0, Collection<bzv> $$1) {
   }

   public static void a(bfz $$0) {
   }

   public static void a(brm $$0) {
   }

   public static void a(cmm $$0, dgl $$1, eei $$2) {
   }

   public static void a(cmm $$0, dgn $$1) {
   }

   public static void a(cmm $$0, gu $$1, dcb $$2, czk $$3) {
   }

   private static void a(bfz $$0, sf $$1) {
      bha<?> $$2 = $$0.dK();
      long $$3 = $$0.dI().V();
      if ($$0 instanceof bxz) {
         bdq $$4 = ((bxz)$$0).w();
         $$1.a($$4.ab_() ? "" : $$4.toString());
      } else {
         $$1.a("");
      }

      $$1.a($$2.a(bpb.t) ? $$2.c(bpb.t) : Optional.empty(), ($$0x, $$1x) -> $$1x.a($$0x));
      if ($$0 instanceof byb $$5) {
         boolean $$6 = $$5.a($$3);
         $$1.writeBoolean($$6);
      } else {
         $$1.writeBoolean(false);
      }

      if ($$0.ae() == bfn.bi) {
         bxs $$7 = (bxs)$$0;
         $$1.writeInt($$7.r());
      } else {
         $$1.writeInt(-1);
      }

      $$1.a($$2.d(), ($$0x, $$1x) -> $$0x.a($$1x.a()));
      Set<String> $$8 = $$2.e().stream().map(bhs::b).collect(Collectors.toSet());
      $$1.a($$8, sf::a);
      $$1.a(a($$0, $$3), ($$0x, $$1x) -> {
         String $$2x = aps.a($$1x, 255, true);
         $$0x.a($$2x);
      });
      if ($$0 instanceof byb) {
         Set<gu> $$9 = Stream.of(bpb.c, bpb.b, bpb.e).map($$2::c).flatMap(Optional::stream).map(hd::b).collect(Collectors.toSet());
         $$1.a($$9, sf::a);
      } else {
         $$1.d(0);
      }

      if ($$0 instanceof byb) {
         Set<gu> $$10 = Stream.of(bpb.d).map($$2::c).flatMap(Optional::stream).map(hd::b).collect(Collectors.toSet());
         $$1.a($$10, sf::a);
      } else {
         $$1.d(0);
      }

      if ($$0 instanceof byb) {
         Map<UUID, Object2IntMap<boy>> $$11 = ((byb)$$0).gt().a();
         List<String> $$12 = Lists.newArrayList();
         $$11.forEach(($$1x, $$2x) -> {
            String $$3x = yz.a($$1x);
            $$2x.forEach(($$2xx, $$3xx) -> $$12.add($$3x + ": " + $$2xx + ": " + $$3xx));
         });
         $$1.a($$12, sf::a);
      } else {
         $$1.d(0);
      }
   }

   private static List<String> a(bfz $$0, long $$1) {
      Map<bpb<?>, Optional<? extends bpa<?>>> $$2 = $$0.dK().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<bpb<?>, Optional<? extends bpa<?>>> $$4 : $$2.entrySet()) {
         bpb<?> $$5 = $$4.getKey();
         Optional<? extends bpa<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            bpa<?> $$7 = (bpa<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == bpb.D) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((aif)$$0.dI(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((aif)$$0.dI(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(jb.C.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(aif $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.a((UUID)$$1));
      } else if ($$1 instanceof bfz) {
         bfj $$2 = (bfj)$$1;
         return yz.a($$2);
      } else if ($$1 instanceof beb) {
         return ((beb)$$1).Z().getString();
      } else if ($$1 instanceof bpe) {
         return a($$0, ((bpe)$$1).a());
      } else if ($$1 instanceof bic) {
         return a($$0, ((bic)$$1).c());
      } else if ($$1 instanceof hd) {
         return a($$0, ((hd)$$1).b());
      } else if ($$1 instanceof bhu) {
         return a($$0, ((bhu)$$1).b());
      } else if ($$1 instanceof ben) {
         bfj $$3 = ((ben)$$1).d();
         return $$3 == null ? $$1.toString() : a($$0, $$3);
      } else if (!($$1 instanceof Collection)) {
         return $$1.toString();
      } else {
         List<String> $$4 = Lists.newArrayList();

         for (Object $$5 : (Iterable)$$1) {
            $$4.add(a($$0, $$5));
         }

         return $$4.toString();
      }
   }

   private static void a(aif $$0, sf $$1, acq $$2) {
      uo<?> $$3 = new vp($$2, $$1);

      for (aig $$4 : $$0.v()) {
         $$4.c.a($$3);
      }
   }
}
