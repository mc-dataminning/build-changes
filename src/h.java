import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.booleans.BooleanArrayList;
import it.unimi.dsi.fastutil.booleans.BooleanList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Matrix3f;

public enum h implements azv {
   a("identity", i.a, false, false, false),
   b("rot_180_face_xy", i.a, true, true, false),
   c("rot_180_face_xz", i.a, true, false, true),
   d("rot_180_face_yz", i.a, false, true, true),
   e("rot_120_nnn", i.d, false, false, false),
   f("rot_120_nnp", i.e, true, false, true),
   g("rot_120_npn", i.e, false, true, true),
   h("rot_120_npp", i.d, true, false, true),
   i("rot_120_pnn", i.e, true, true, false),
   j("rot_120_pnp", i.d, true, true, false),
   k("rot_120_ppn", i.d, false, true, true),
   l("rot_120_ppp", i.e, false, false, false),
   m("rot_180_edge_xy_neg", i.b, true, true, true),
   n("rot_180_edge_xy_pos", i.b, false, false, true),
   o("rot_180_edge_xz_neg", i.f, true, true, true),
   p("rot_180_edge_xz_pos", i.f, false, true, false),
   q("rot_180_edge_yz_neg", i.c, true, true, true),
   r("rot_180_edge_yz_pos", i.c, true, false, false),
   s("rot_90_x_neg", i.c, false, false, true),
   t("rot_90_x_pos", i.c, false, true, false),
   u("rot_90_y_neg", i.f, true, false, false),
   v("rot_90_y_pos", i.f, false, false, true),
   w("rot_90_z_neg", i.b, false, true, false),
   x("rot_90_z_pos", i.b, true, false, false),
   y("inversion", i.a, true, true, true),
   z("invert_x", i.a, true, false, false),
   A("invert_y", i.a, false, true, false),
   B("invert_z", i.a, false, false, true),
   C("rot_60_ref_nnn", i.e, true, true, true),
   D("rot_60_ref_nnp", i.d, true, false, false),
   E("rot_60_ref_npn", i.d, false, false, true),
   F("rot_60_ref_npp", i.e, false, false, true),
   G("rot_60_ref_pnn", i.d, false, true, false),
   H("rot_60_ref_pnp", i.e, true, false, false),
   I("rot_60_ref_ppn", i.e, false, true, false),
   J("rot_60_ref_ppp", i.d, true, true, true),
   K("swap_xy", i.b, false, false, false),
   L("swap_yz", i.c, false, false, false),
   M("swap_xz", i.f, false, false, false),
   N("swap_neg_xy", i.b, true, true, false),
   O("swap_neg_yz", i.c, false, true, true),
   P("swap_neg_xz", i.f, true, false, true),
   Q("rot_90_ref_x_neg", i.c, true, false, true),
   R("rot_90_ref_x_pos", i.c, true, true, false),
   S("rot_90_ref_y_neg", i.f, true, true, false),
   T("rot_90_ref_y_pos", i.f, false, true, true),
   U("rot_90_ref_z_neg", i.b, false, true, true),
   V("rot_90_ref_z_pos", i.b, true, false, true);

   private static final jn.a[] X = jn.a.values();
   private final Matrix3f Y;
   private final String Z;
   @Nullable
   private Map<jn, jn> aa;
   private final boolean ab;
   private final boolean ac;
   private final boolean ad;
   private final i ae;
   private static final h[][] af = af.a(new h[values().length][values().length], $$0 -> {
      Map<Pair<i, BooleanList>, h> $$1 = Arrays.stream(values()).collect(Collectors.toMap($$0x -> Pair.of($$0x.ae, $$0x.d()), $$0x -> $$0x));

      for (h $$2 : values()) {
         for (h $$3 : values()) {
            BooleanList $$4 = $$2.d();
            BooleanList $$5 = $$3.d();
            i $$6 = $$3.ae.a($$2.ae);
            BooleanArrayList $$7 = new BooleanArrayList(3);

            for (int $$8 = 0; $$8 < 3; $$8++) {
               $$7.add($$4.getBoolean($$8) ^ $$5.getBoolean($$2.ae.a($$8)));
            }

            $$0[$$2.ordinal()][$$3.ordinal()] = $$1.get(Pair.of($$6, $$7));
         }
      }
   });
   private static final h[] ag = Arrays.stream(values()).map($$0 -> Arrays.stream(values()).filter($$1 -> $$0.a($$1) == a).findAny().get()).toArray(h[]::new);

   private h(final String $$0, final i $$1, final boolean $$2, final boolean $$3, final boolean $$4) {
      this.Z = $$0;
      this.ab = $$2;
      this.ac = $$3;
      this.ad = $$4;
      this.ae = $$1;
      this.Y = new Matrix3f().scaling($$2 ? -1.0F : 1.0F, $$3 ? -1.0F : 1.0F, $$4 ? -1.0F : 1.0F);
      this.Y.mul($$1.a());
   }

   private BooleanList d() {
      return new BooleanArrayList(new boolean[]{this.ab, this.ac, this.ad});
   }

   public h a(h $$0) {
      return af[this.ordinal()][$$0.ordinal()];
   }

   public h a() {
      return ag[this.ordinal()];
   }

   public Matrix3f b() {
      return new Matrix3f(this.Y);
   }

   @Override
   public String toString() {
      return this.Z;
   }

   @Override
   public String c() {
      return this.Z;
   }

   public jn a(jn $$0) {
      if (this.aa == null) {
         this.aa = af.a(jn.class, $$0x -> {
            jn.a $$1 = $$0x.o();
            jn.b $$2 = $$0x.f();
            jn.a $$3 = this.b($$1);
            jn.b $$4 = this.a($$3) ? $$2.c() : $$2;
            return jn.a($$3, $$4);
         });
      }

      return this.aa.get($$0);
   }

   public boolean a(jn.a $$0) {
      switch ($$0) {
         case a:
            return this.ab;
         case b:
            return this.ac;
         case c:
         default:
            return this.ad;
      }
   }

   public jn.a b(jn.a $$0) {
      return X[this.ae.a($$0.ordinal())];
   }

   public jp a(jp $$0) {
      return jp.a(this.a($$0.a()), this.a($$0.b()));
   }

   public static h a(int $$0, int $$1) {
      $$0 = ayz.b($$0, 360);
      $$1 = ayz.b($$1, 360);
      if ($$0 % 90 == 0 && $$1 % 90 == 0) {
         h $$2 = a;

         for (int $$3 = 0; $$3 < $$1; $$3 += 90) {
            $$2 = $$2.a(u);
         }

         for (int $$4 = 0; $$4 < $$0; $$4 += 90) {
            $$2 = $$2.a(s);
         }

         return $$2;
      } else {
         throw new IllegalArgumentException("Angles must be divisible by 90");
      }
   }
}
