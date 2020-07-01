package xyz.przemyk.simpleplanes.items.furnacePlane;

import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import xyz.przemyk.simpleplanes.entities.furnacePlane.OakFurnacePlaneEntity;
import xyz.przemyk.simpleplanes.entities.furnacePlane.SpruceFurnacePlaneEntity;
import xyz.przemyk.simpleplanes.items.AbstractPlaneItem;

public class SpruceFurnacePlaneItem extends AbstractPlaneItem<SpruceFurnacePlaneEntity> {

    public SpruceFurnacePlaneItem(Properties properties) {
        super(properties);
    }

    @Override
    protected SpruceFurnacePlaneEntity createPlane(World worldIn, RayTraceResult raytraceresult) {
        return new SpruceFurnacePlaneEntity(worldIn, raytraceresult.getHitVec().x, raytraceresult.getHitVec().y, raytraceresult.getHitVec().z);
    }
}
