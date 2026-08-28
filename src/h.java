import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.booleans.BooleanArrayList;
import it.unimi.dsi.fastutil.booleans.BooleanList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.joml.Matrix3f;

public enum h implements bai {
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

   private final Matrix3f X;
   private final String Y;
   @Nullable
   private Map<jm, jm> Z;
   private final boolean aa;
   private final boolean ab;
   private final boolean ac;
   private final i ad;
   private static final h[][] ae = ae.a(new h[values().length][values().length], $$0 -> {
      Map<Pair<i, BooleanList>, h> $$1 = Arrays.stream(values()).collect(Collectors.toMap($$0x -> Pair.of($$0x.ad, $$0x.d()), $$0x -> $$0x));

      for (h $$2 : values()) {
         for (h $$3 : values()) {
            BooleanList $$4 = $$2.d();
            BooleanList $$5 = $$3.d();
            i $$6 = $$3.ad.a($$2.ad);
            BooleanArrayList $$7 = new BooleanArrayList(3);

            for (int $$8 = 0; $$8 < 3; $$8++) {
               $$7.add($$4.getBoolean($$8) ^ $$5.getBoolean($$2.ad.a($$8)));
            }

            $$0[$$2.ordinal()][$$3.ordinal()] = $$1.get(Pair.of($$6, $$7));
         }
      }
   });
   private static final h[] af = Arrays.stream(values()).map($$0 -> Arrays.stream(values()).filter($$1 -> $$0.a($$1) == a).findAny().get()).toArray(h[]::new);

   private h(final String $$0, final i $$1, final boolean $$2, final boolean $$3, final boolean $$4) {
      this.Y = $$0;
      this.aa = $$2;
      this.ab = $$3;
      this.ac = $$4;
      this.ad = $$1;
      this.X = new Matrix3f().scaling($$2 ? -1.0F : 1.0F, $$3 ? -1.0F : 1.0F, $$4 ? -1.0F : 1.0F);
      this.X.mul($$1.a());
   }

   private BooleanList d() {
      return new BooleanArrayList(new boolean[]{this.aa, this.ab, this.ac});
   }

   public h a(h $$0) {
      return ae[this.ordinal()][$$0.ordinal()];
   }

   public h a() {
      return af[this.ordinal()];
   }

   public Matrix3f b() {
      return new Matrix3f(this.X);
   }

   @Override
   public String toString() {
      return this.Y;
   }

   @Override
   public String c() {
      return this.Y;
   }

   public jm a(jm $$0) {
      if (this.Z == null) {
         this.Z = Maps.newEnumMap(jm.class);
         jm.a[] $$1 = jm.a.values();

         for (jm $$2 : jm.values()) {
            jm.a $$3 = $$2.o();
            jm.b $$4 = $$2.f();
            jm.a $$5 = $$1[this.ad.a($$3.ordinal())];
            jm.b $$6 = this.a($$5) ? $$4.c() : $$4;
            jm $$7 = jm.a($$5, $$6);
            this.Z.put($$2, $$7);
         }
      }

      return this.Z.get($$0);
   }

   public boolean a(jm.a $$0) {
      switch ($$0) {
         case a:
            return this.aa;
         case b:
            return this.ab;
         case c:
         default:
            return this.ac;
      }
   }

   public jo a(jo $$0) {
      return jo.a(this.a($$0.a()), this.a($$0.b()));
   }
}
