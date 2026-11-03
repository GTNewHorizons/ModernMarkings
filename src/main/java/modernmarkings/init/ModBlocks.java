package modernmarkings.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;

import cpw.mods.fml.common.registry.GameRegistry;
import modernmarkings.blocks.MarkingFloor;
import modernmarkings.blocks.MarkingWall;

public class ModBlocks {

    /**
     * Storing all Mod Blocks in an Array List
     */
    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final List<Block> FLOOR_BLOCKS = new ArrayList<>();
    public static final List<Block> WALL_BLOCKS = new ArrayList<>();

    // spotless:off
    public static final Block FLOOR_MARKING_BLACK_SINGLELINE = new MarkingFloor("floor_marking_black_singleline", "marking_black_singleline");

    public static final Block FLOOR_MARKING_WHITE_ARROW = new MarkingFloor("floor_marking_white_arrow", "marking_white_arrow");
    public static final Block FLOOR_MARKING_WHITE_LANE = new MarkingFloor("floor_marking_white_lane", "marking_white_lane");
    public static final Block FLOOR_MARKING_WHITE_LANE_CROSS = new MarkingFloor("floor_marking_white_lane_cross", "marking_white_lane_cross");
    public static final Block FLOOR_MARKING_WHITE_SINGLELINE = new MarkingFloor("floor_marking_white_singleline", "marking_white_singleline");
    public static final Block FLOOR_MARKING_WHITE_SQUARE = new MarkingFloor("floor_marking_white_square", "marking_white_square");
    public static final Block FLOOR_MARKING_WHITEBLACK_HAZARDLINE = new MarkingFloor("floor_marking_whiteblack_hazardline", "marking_whiteblack_hazardline");
    public static final Block FLOOR_MARKING_NOENTRY = new MarkingFloor("floor_marking_noentry", "marking_noentry");
    public static final Block FLOOR_MARKING_NOSTEP = new MarkingFloor("floor_marking_nostep", "marking_nostep");
    public static final Block FLOOR_MARKING_EXIT = new MarkingFloor("floor_marking_exit", "marking_exit");

    public static final Block FLOOR_MARKING_YELLOW_ARROW = new MarkingFloor("floor_marking_yellow_arrow", "marking_yellow_arrow");
    public static final Block FLOOR_MARKING_YELLOW_HAZARDLINE = new MarkingFloor("floor_marking_yellow_hazardline", "marking_yellow_hazardline");
    public static final Block FLOOR_MARKING_YELLOW_LANE = new MarkingFloor("floor_marking_yellow_lane", "marking_yellow_lane");
    public static final Block FLOOR_MARKING_YELLOW_SIDELINE = new MarkingFloor("floor_marking_yellow_sideline", "marking_yellow_sideline");
    public static final Block FLOOR_MARKING_YELLOW_SINGLELINE = new MarkingFloor("floor_marking_yellow_singleline", "marking_yellow_singleline");
    public static final Block FLOOR_MARKING_YELLOW_SQUARE = new MarkingFloor("floor_marking_yellow_square", "marking_yellow_square");
    public static final Block FLOOR_MARKING_YELLOW_STRIPES = new MarkingFloor("floor_marking_yellow_stripes", "marking_yellow_stripes");
    public static final Block FLOOR_MARKING_YELLOW_T_CROSSING = new MarkingFloor("floor_marking_yellow_t_crossing", "marking_yellow_t_crossing");
    public static final Block FLOOR_MARKING_YELLOW_CROSSING = new MarkingFloor("floor_marking_yellow_crossing", "marking_yellow_crossing");
    public static final Block FLOOR_MARKING_YELLOW_TURN = new MarkingFloor("floor_marking_yellow_turn", "marking_yellow_turn");
    public static final Block FLOOR_MARKING_YELLOW_END = new MarkingFloor("floor_marking_yellow_end", "marking_yellow_end");
    public static final Block FLOOR_MARKING_DANGER_YELLOW = new MarkingFloor("floor_marking_danger_yellow", "marking_danger_yellow");

    public static final Block FLOOR_MARKING_WHITE_T_CROSSING = new MarkingFloor("floor_marking_white_t_crossing", "marking_white_t_crossing");
    public static final Block FLOOR_MARKING_WHITE_CROSSING = new MarkingFloor("floor_marking_white_crossing", "marking_white_crossing");
    public static final Block FLOOR_MARKING_WHITE_TURN = new MarkingFloor("floor_marking_white_turn", "marking_white_turn");
    public static final Block FLOOR_MARKING_WHITE_END = new MarkingFloor("floor_marking_white_end", "marking_white_end");
    public static final Block FLOOR_MARKING_WHITE_SIDELINE = new MarkingFloor("floor_marking_white_sideline", "marking_white_sideline");

    public static final Block FLOOR_MARKING_GREEN_T_CROSSING = new MarkingFloor("floor_marking_green_t_crossing", "marking_green_t_crossing");
    public static final Block FLOOR_MARKING_GREEN_CROSSING = new MarkingFloor("floor_marking_green_crossing", "marking_green_crossing");
    public static final Block FLOOR_MARKING_GREEN_TURN = new MarkingFloor("floor_marking_green_turn", "marking_green_turn");
    public static final Block FLOOR_MARKING_GREEN_END = new MarkingFloor("floor_marking_green_end", "marking_green_end");
    public static final Block FLOOR_MARKING_GREEN_SIDELINE = new MarkingFloor("floor_marking_green_sideline", "marking_green_sideline");
    public static final Block FLOOR_MARKING_GREEN_SQUARE = new MarkingFloor("floor_marking_green_square", "marking_green_square");
    public static final Block FLOOR_MARKING_GREEN_HAZARDLINE = new MarkingFloor("floor_marking_green_hazardline", "marking_green_hazardline");
    public static final Block FLOOR_MARKING_GREEN_SINGLELINE = new MarkingFloor("floor_marking_green_singleline", "marking_green_singleline");

    public static final Block FLOOR_MARKING_BLUE_T_CROSSING = new MarkingFloor("floor_marking_blue_t_crossing", "marking_blue_t_crossing");
    public static final Block FLOOR_MARKING_BLUE_CROSSING = new MarkingFloor("floor_marking_blue_crossing", "marking_blue_crossing");
    public static final Block FLOOR_MARKING_BLUE_TURN = new MarkingFloor("floor_marking_blue_turn", "marking_blue_turn");
    public static final Block FLOOR_MARKING_BLUE_END = new MarkingFloor("floor_marking_blue_end", "marking_blue_end");
    public static final Block FLOOR_MARKING_BLUE_SIDELINE = new MarkingFloor("floor_marking_blue_sideline", "marking_blue_sideline");
    public static final Block FLOOR_MARKING_BLUE_SQUARE = new MarkingFloor("floor_marking_blue_square", "marking_blue_square");
    public static final Block FLOOR_MARKING_BLUE_HAZARDLINE = new MarkingFloor("floor_marking_blue_hazardline", "marking_blue_hazardline");
    public static final Block FLOOR_MARKING_BLUE_SINGLELINE = new MarkingFloor("floor_marking_blue_singleline", "marking_blue_singleline");

    public static final Block FLOOR_MARKING_RED_T_CROSSING = new MarkingFloor("floor_marking_red_t_crossing", "marking_red_t_crossing");
    public static final Block FLOOR_MARKING_RED_CROSSING = new MarkingFloor("floor_marking_red_crossing", "marking_red_crossing");
    public static final Block FLOOR_MARKING_RED_TURN = new MarkingFloor("floor_marking_red_turn", "marking_red_turn");
    public static final Block FLOOR_MARKING_RED_END = new MarkingFloor("floor_marking_red_end", "marking_red_end");
    public static final Block FLOOR_MARKING_RED_SIDELINE = new MarkingFloor("floor_marking_red_sideline", "marking_red_sideline");
    public static final Block FLOOR_MARKING_RED_SQUARE = new MarkingFloor("floor_marking_red_square", "marking_red_square");
    public static final Block FLOOR_MARKING_RED_HAZARDLINE = new MarkingFloor("floor_marking_red_hazardline", "marking_red_hazardline");
    public static final Block FLOOR_MARKING_RED_SINGLELINE = new MarkingFloor("floor_marking_red_singleline", "marking_red_singleline");
    public static final Block FLOOR_MARKING_DANGER_RED = new MarkingFloor("floor_marking_danger_red", "marking_danger_red");
    public static final Block FLOOR_MARKING_REDX = new MarkingFloor("floor_marking_redx", "marking_redx");

    public static final Block FLOOR_MARKING_ORANGE_T_CROSSING = new MarkingFloor("floor_marking_orange_t_crossing", "marking_orange_t_crossing");
    public static final Block FLOOR_MARKING_ORANGE_CROSSING = new MarkingFloor("floor_marking_orange_crossing", "marking_orange_crossing");
    public static final Block FLOOR_MARKING_ORANGE_TURN = new MarkingFloor("floor_marking_orange_turn", "marking_orange_turn");
    public static final Block FLOOR_MARKING_ORANGE_END = new MarkingFloor("floor_marking_orange_end", "marking_orange_end");
    public static final Block FLOOR_MARKING_ORANGE_SIDELINE = new MarkingFloor("floor_marking_orange_sideline", "marking_orange_sideline");
    public static final Block FLOOR_MARKING_ORANGE_SQUARE = new MarkingFloor("floor_marking_orange_square", "marking_orange_square");
    public static final Block FLOOR_MARKING_ORANGE_HAZARDLINE = new MarkingFloor("floor_marking_orange_hazardline", "marking_orange_hazardline");
    public static final Block FLOOR_MARKING_ORANGE_SINGLELINE = new MarkingFloor("floor_marking_orange_singleline", "marking_orange_singleline");

    public static final Block FLOOR_MARKING_LETTER_A = new MarkingFloor("floor_marking_letter_a", "marking_letter_a");
    public static final Block FLOOR_MARKING_LETTER_B = new MarkingFloor("floor_marking_letter_b", "marking_letter_b");
    public static final Block FLOOR_MARKING_LETTER_C = new MarkingFloor("floor_marking_letter_c", "marking_letter_c");
    public static final Block FLOOR_MARKING_LETTER_D = new MarkingFloor("floor_marking_letter_d", "marking_letter_d");
    public static final Block FLOOR_MARKING_LETTER_E = new MarkingFloor("floor_marking_letter_e", "marking_letter_e");
    public static final Block FLOOR_MARKING_LETTER_F = new MarkingFloor("floor_marking_letter_f", "marking_letter_f");
    public static final Block FLOOR_MARKING_LETTER_G = new MarkingFloor("floor_marking_letter_g", "marking_letter_g");
    public static final Block FLOOR_MARKING_LETTER_H = new MarkingFloor("floor_marking_letter_h", "marking_letter_h");
    public static final Block FLOOR_MARKING_LETTER_I = new MarkingFloor("floor_marking_letter_i", "marking_letter_i");
    public static final Block FLOOR_MARKING_LETTER_J = new MarkingFloor("floor_marking_letter_j", "marking_letter_j");
    public static final Block FLOOR_MARKING_LETTER_K = new MarkingFloor("floor_marking_letter_k", "marking_letter_k");
    public static final Block FLOOR_MARKING_LETTER_L = new MarkingFloor("floor_marking_letter_l", "marking_letter_l");
    public static final Block FLOOR_MARKING_LETTER_M = new MarkingFloor("floor_marking_letter_m", "marking_letter_m");
    public static final Block FLOOR_MARKING_LETTER_N = new MarkingFloor("floor_marking_letter_n", "marking_letter_n");
    public static final Block FLOOR_MARKING_LETTER_O = new MarkingFloor("floor_marking_letter_o", "marking_letter_o");
    public static final Block FLOOR_MARKING_LETTER_P = new MarkingFloor("floor_marking_letter_p", "marking_letter_p");
    public static final Block FLOOR_MARKING_LETTER_Q = new MarkingFloor("floor_marking_letter_q", "marking_letter_q");
    public static final Block FLOOR_MARKING_LETTER_R = new MarkingFloor("floor_marking_letter_r", "marking_letter_r");
    public static final Block FLOOR_MARKING_LETTER_S = new MarkingFloor("floor_marking_letter_s", "marking_letter_s");
    public static final Block FLOOR_MARKING_LETTER_T = new MarkingFloor("floor_marking_letter_t", "marking_letter_t");
    public static final Block FLOOR_MARKING_LETTER_U = new MarkingFloor("floor_marking_letter_u", "marking_letter_u");
    public static final Block FLOOR_MARKING_LETTER_V = new MarkingFloor("floor_marking_letter_v", "marking_letter_v");
    public static final Block FLOOR_MARKING_LETTER_W = new MarkingFloor("floor_marking_letter_w", "marking_letter_w");
    public static final Block FLOOR_MARKING_LETTER_X = new MarkingFloor("floor_marking_letter_x", "marking_letter_x");
    public static final Block FLOOR_MARKING_LETTER_Y = new MarkingFloor("floor_marking_letter_y", "marking_letter_y");
    public static final Block FLOOR_MARKING_LETTER_Z = new MarkingFloor("floor_marking_letter_z", "marking_letter_z");

    public static final Block WALL_MARKING_EXIT = new MarkingWall("wall_marking_exit", "marking_exit");
    public static final Block WALL_MARKING_UNIT = new MarkingWall("wall_marking_unit", "marking_wall_unit");
    public static final Block WALL_MARKING_FIRST_AID = new MarkingWall("wall_marking_first_aid", "marking_wall_first_aid");
    public static final Block WALL_MARKING_FIRE_EXTINGUISHER = new MarkingWall("wall_marking_fire_extinguisher", "marking_wall_fire_extinguisher");
    public static final Block WALL_MARKING_NUMBER_0 = new MarkingWall("wall_marking_number_0", "marking_number_0");
    public static final Block WALL_MARKING_NUMBER_1 = new MarkingWall("wall_marking_number_1", "marking_number_1");
    public static final Block WALL_MARKING_NUMBER_2 = new MarkingWall("wall_marking_number_2", "marking_number_2");
    public static final Block WALL_MARKING_NUMBER_3 = new MarkingWall("wall_marking_number_3", "marking_number_3");
    public static final Block WALL_MARKING_NUMBER_4 = new MarkingWall("wall_marking_number_4", "marking_number_4");
    public static final Block WALL_MARKING_NUMBER_5 = new MarkingWall("wall_marking_number_5", "marking_number_5");
    public static final Block WALL_MARKING_NUMBER_6 = new MarkingWall("wall_marking_number_6", "marking_number_6");
    public static final Block WALL_MARKING_NUMBER_7 = new MarkingWall("wall_marking_number_7", "marking_number_7");
    public static final Block WALL_MARKING_NUMBER_8 = new MarkingWall("wall_marking_number_8", "marking_number_8");
    public static final Block WALL_MARKING_NUMBER_9 = new MarkingWall("wall_marking_number_9", "marking_number_9");
    public static final Block WALL_MARKING_NUMBER_NO = new MarkingWall("wall_marking_number_no", "marking_number_no");
    public static final Block WALL_MARKING_NUMBER_NUMERO = new MarkingWall("wall_marking_number_numero", "marking_number_numero");
    public static final Block WALL_MARKING_NUMBER_DASH = new MarkingWall("wall_marking_number_dash", "marking_number_dash");
    public static final Block WALL_MARKING_NUMBER_COMMA = new MarkingWall("wall_marking_number_comma", "marking_number_comma");
    public static final Block WALL_MARKING_NUMBER_PERIOD = new MarkingWall("wall_marking_number_period", "marking_number_period");
    public static final Block WALL_MARKING_SYMBOL_CHEMICAL = new MarkingWall("wall_marking_symbol_chemical", "marking_wall_symbol_chemical");
    public static final Block WALL_MARKING_SYMBOL_ELECTRIC = new MarkingWall("wall_marking_symbol_electric", "marking_wall_symbol_electric");
    public static final Block WALL_MARKING_SYMBOL_FIRE = new MarkingWall("wall_marking_symbol_fire", "marking_wall_symbol_fire");
    public static final Block WALL_MARKING_SYMBOL_FLUID = new MarkingWall("wall_marking_symbol_fluid", "marking_wall_symbol_fluid");
    public static final Block WALL_MARKING_SYMBOL_FROST = new MarkingWall("wall_marking_symbol_frost", "marking_wall_symbol_frost");
    public static final Block WALL_MARKING_SYMBOL_GEARS = new MarkingWall("wall_marking_symbol_gears", "marking_wall_symbol_gears");
    public static final Block WALL_MARKING_SYMBOL_LASER = new MarkingWall("wall_marking_symbol_laser", "marking_wall_symbol_laser");
    public static final Block WALL_MARKING_SYMBOL_MAGIC = new MarkingWall("wall_marking_symbol_magic", "marking_wall_symbol_magic");
    public static final Block WALL_MARKING_SYMBOL_MOB = new MarkingWall("wall_marking_symbol_mob", "marking_wall_symbol_mob");
    public static final Block WALL_MARKING_SYMBOL_PINCH = new MarkingWall("wall_marking_symbol_pinch", "marking_wall_symbol_pinch");
    public static final Block WALL_MARKING_SYMBOL_PRODUCTION = new MarkingWall("wall_marking_symbol_production", "marking_wall_symbol_production");
    public static final Block WALL_MARKING_SYMBOL_RADIATION = new MarkingWall("wall_marking_symbol_radiation", "marking_wall_symbol_radiation");
    public static final Block WALL_MARKING_SYMBOL_RADIATION_2 = new MarkingWall("wall_marking_symbol_radiation_2", "marking_wall_symbol_radiation_2");
    public static final Block WALL_MARKING_SYMBOL_STORAGE = new MarkingWall("wall_marking_symbol_storage", "marking_wall_symbol_storage");
    public static final Block WALL_MARKING_WARNING_DANGER = new MarkingWall("wall_marking_warning_danger", "marking_wall_warning_danger");
    public static final Block WALL_MARKING_ARROWLEFT = new MarkingWall("wall_marking_arrowleft", "marking_wall_arrowleft");
    public static final Block WALL_MARKING_ARROWRIGHT = new MarkingWall("wall_marking_arrowright", "marking_wall_arrowright");
    public static final Block WALL_MARKING_HAZARDLINE_LEFT = new MarkingWall("wall_marking_hazardline_left", "marking_wall_hazardline_left");
    public static final Block WALL_MARKING_HAZARDLINE_RIGHT = new MarkingWall("wall_marking_hazardline_right", "marking_wall_hazardline_right");
    public static final Block WALL_MARKING_HAZARD_DIAMOND = new MarkingWall("wall_marking_hazard_diamond", "marking_wall_hazard_diamond");

    public static final Block WALL_MARKING_VOLTAGE_EU = new MarkingWall("wall_marking_voltage_eu", "marking_wall_voltage_eu");
    public static final Block WALL_MARKING_VOLTAGE_EV = new MarkingWall("wall_marking_voltage_ev", "marking_wall_voltage_ev");
    public static final Block WALL_MARKING_VOLTAGE_FE = new MarkingWall("wall_marking_voltage_fe", "marking_wall_voltage_fe");
    public static final Block WALL_MARKING_VOLTAGE_HV = new MarkingWall("wall_marking_voltage_hv", "marking_wall_voltage_hv");
    public static final Block WALL_MARKING_VOLTAGE_IV = new MarkingWall("wall_marking_voltage_iv", "marking_wall_voltage_iv");
    public static final Block WALL_MARKING_VOLTAGE_LUV = new MarkingWall("wall_marking_voltage_luv", "marking_wall_voltage_luv");
    public static final Block WALL_MARKING_VOLTAGE_LV = new MarkingWall("wall_marking_voltage_lv", "marking_wall_voltage_lv");
    public static final Block WALL_MARKING_VOLTAGE_MAX = new MarkingWall("wall_marking_voltage_max", "marking_wall_voltage_max");
    public static final Block WALL_MARKING_VOLTAGE_MV = new MarkingWall("wall_marking_voltage_mv", "marking_wall_voltage_mv");
    public static final Block WALL_MARKING_VOLTAGE_PERT = new MarkingWall("wall_marking_voltage_pert", "marking_wall_voltage_pert");
    public static final Block WALL_MARKING_VOLTAGE_RF = new MarkingWall("wall_marking_voltage_rf", "marking_wall_voltage_rf");
    public static final Block WALL_MARKING_VOLTAGE_UEV = new MarkingWall("wall_marking_voltage_uev", "marking_wall_voltage_uev");
    public static final Block WALL_MARKING_VOLTAGE_UHV = new MarkingWall("wall_marking_voltage_uhv", "marking_wall_voltage_uhv");
    public static final Block WALL_MARKING_VOLTAGE_UIV = new MarkingWall("wall_marking_voltage_uiv", "marking_wall_voltage_uiv");
    public static final Block WALL_MARKING_VOLTAGE_UMV = new MarkingWall("wall_marking_voltage_umv", "marking_wall_voltage_umv");
    public static final Block WALL_MARKING_VOLTAGE_UV = new MarkingWall("wall_marking_voltage_uv", "marking_wall_voltage_uv");
    public static final Block WALL_MARKING_VOLTAGE_UXV = new MarkingWall("wall_marking_voltage_uxv", "marking_wall_voltage_uxv");
    public static final Block WALL_MARKING_VOLTAGE_ZPM = new MarkingWall("wall_marking_voltage_zpm", "marking_wall_voltage_zpm");

    public static final Block WALL_MARKING_LETTER_A = new MarkingWall("wall_marking_letter_a", "marking_letter_a");
    public static final Block WALL_MARKING_LETTER_B = new MarkingWall("wall_marking_letter_b", "marking_letter_b");
    public static final Block WALL_MARKING_LETTER_C = new MarkingWall("wall_marking_letter_c", "marking_letter_c");
    public static final Block WALL_MARKING_LETTER_D = new MarkingWall("wall_marking_letter_d", "marking_letter_d");
    public static final Block WALL_MARKING_LETTER_E = new MarkingWall("wall_marking_letter_e", "marking_letter_e");
    public static final Block WALL_MARKING_LETTER_F = new MarkingWall("wall_marking_letter_f", "marking_letter_f");
    public static final Block WALL_MARKING_LETTER_G = new MarkingWall("wall_marking_letter_g", "marking_letter_g");
    public static final Block WALL_MARKING_LETTER_H = new MarkingWall("wall_marking_letter_h", "marking_letter_h");
    public static final Block WALL_MARKING_LETTER_I = new MarkingWall("wall_marking_letter_i", "marking_letter_i");
    public static final Block WALL_MARKING_LETTER_J = new MarkingWall("wall_marking_letter_j", "marking_letter_j");
    public static final Block WALL_MARKING_LETTER_K = new MarkingWall("wall_marking_letter_k", "marking_letter_k");
    public static final Block WALL_MARKING_LETTER_L = new MarkingWall("wall_marking_letter_l", "marking_letter_l");
    public static final Block WALL_MARKING_LETTER_M = new MarkingWall("wall_marking_letter_m", "marking_letter_m");
    public static final Block WALL_MARKING_LETTER_N = new MarkingWall("wall_marking_letter_n", "marking_letter_n");
    public static final Block WALL_MARKING_LETTER_O = new MarkingWall("wall_marking_letter_o", "marking_letter_o");
    public static final Block WALL_MARKING_LETTER_P = new MarkingWall("wall_marking_letter_p", "marking_letter_p");
    public static final Block WALL_MARKING_LETTER_Q = new MarkingWall("wall_marking_letter_q", "marking_letter_q");
    public static final Block WALL_MARKING_LETTER_R = new MarkingWall("wall_marking_letter_r", "marking_letter_r");
    public static final Block WALL_MARKING_LETTER_S = new MarkingWall("wall_marking_letter_s", "marking_letter_s");
    public static final Block WALL_MARKING_LETTER_T = new MarkingWall("wall_marking_letter_t", "marking_letter_t");
    public static final Block WALL_MARKING_LETTER_U = new MarkingWall("wall_marking_letter_u", "marking_letter_u");
    public static final Block WALL_MARKING_LETTER_V = new MarkingWall("wall_marking_letter_v", "marking_letter_v");
    public static final Block WALL_MARKING_LETTER_W = new MarkingWall("wall_marking_letter_w", "marking_letter_w");
    public static final Block WALL_MARKING_LETTER_X = new MarkingWall("wall_marking_letter_x", "marking_letter_x");
    public static final Block WALL_MARKING_LETTER_Y = new MarkingWall("wall_marking_letter_y", "marking_letter_y");
    public static final Block WALL_MARKING_LETTER_Z = new MarkingWall("wall_marking_letter_z", "marking_letter_z");

    // missing floor numbers
    public static final Block FLOOR_MARKING_NUMBER_0 = new MarkingFloor("floor_marking_number_0", "marking_number_0");
    public static final Block FLOOR_MARKING_NUMBER_1 = new MarkingFloor("floor_marking_number_1", "marking_number_1");
    public static final Block FLOOR_MARKING_NUMBER_2 = new MarkingFloor("floor_marking_number_2", "marking_number_2");
    public static final Block FLOOR_MARKING_NUMBER_3 = new MarkingFloor("floor_marking_number_3", "marking_number_3");
    public static final Block FLOOR_MARKING_NUMBER_4 = new MarkingFloor("floor_marking_number_4", "marking_number_4");
    public static final Block FLOOR_MARKING_NUMBER_5 = new MarkingFloor("floor_marking_number_5", "marking_number_5");
    public static final Block FLOOR_MARKING_NUMBER_6 = new MarkingFloor("floor_marking_number_6", "marking_number_6");
    public static final Block FLOOR_MARKING_NUMBER_7 = new MarkingFloor("floor_marking_number_7", "marking_number_7");
    public static final Block FLOOR_MARKING_NUMBER_8 = new MarkingFloor("floor_marking_number_8", "marking_number_8");
    public static final Block FLOOR_MARKING_NUMBER_9 = new MarkingFloor("floor_marking_number_9", "marking_number_9");

    // black variant
    public static final Block FLOOR_MARKING_LETTER_A_BLACK = new MarkingFloor("floor_marking_letter_a_black", "marking_letter_a_black");
    public static final Block FLOOR_MARKING_LETTER_B_BLACK = new MarkingFloor("floor_marking_letter_b_black", "marking_letter_b_black");
    public static final Block FLOOR_MARKING_LETTER_C_BLACK = new MarkingFloor("floor_marking_letter_c_black", "marking_letter_c_black");
    public static final Block FLOOR_MARKING_LETTER_D_BLACK = new MarkingFloor("floor_marking_letter_d_black", "marking_letter_d_black");
    public static final Block FLOOR_MARKING_LETTER_E_BLACK = new MarkingFloor("floor_marking_letter_e_black", "marking_letter_e_black");
    public static final Block FLOOR_MARKING_LETTER_F_BLACK = new MarkingFloor("floor_marking_letter_f_black", "marking_letter_f_black");
    public static final Block FLOOR_MARKING_LETTER_G_BLACK = new MarkingFloor("floor_marking_letter_g_black", "marking_letter_g_black");
    public static final Block FLOOR_MARKING_LETTER_H_BLACK = new MarkingFloor("floor_marking_letter_h_black", "marking_letter_h_black");
    public static final Block FLOOR_MARKING_LETTER_I_BLACK = new MarkingFloor("floor_marking_letter_i_black", "marking_letter_i_black");
    public static final Block FLOOR_MARKING_LETTER_J_BLACK = new MarkingFloor("floor_marking_letter_j_black", "marking_letter_j_black");
    public static final Block FLOOR_MARKING_LETTER_K_BLACK = new MarkingFloor("floor_marking_letter_k_black", "marking_letter_k_black");
    public static final Block FLOOR_MARKING_LETTER_L_BLACK = new MarkingFloor("floor_marking_letter_l_black", "marking_letter_l_black");
    public static final Block FLOOR_MARKING_LETTER_M_BLACK = new MarkingFloor("floor_marking_letter_m_black", "marking_letter_m_black");
    public static final Block FLOOR_MARKING_LETTER_N_BLACK = new MarkingFloor("floor_marking_letter_n_black", "marking_letter_n_black");
    public static final Block FLOOR_MARKING_LETTER_O_BLACK = new MarkingFloor("floor_marking_letter_o_black", "marking_letter_o_black");
    public static final Block FLOOR_MARKING_LETTER_P_BLACK = new MarkingFloor("floor_marking_letter_p_black", "marking_letter_p_black");
    public static final Block FLOOR_MARKING_LETTER_Q_BLACK = new MarkingFloor("floor_marking_letter_q_black", "marking_letter_q_black");
    public static final Block FLOOR_MARKING_LETTER_R_BLACK = new MarkingFloor("floor_marking_letter_r_black", "marking_letter_r_black");
    public static final Block FLOOR_MARKING_LETTER_S_BLACK = new MarkingFloor("floor_marking_letter_s_black", "marking_letter_s_black");
    public static final Block FLOOR_MARKING_LETTER_T_BLACK = new MarkingFloor("floor_marking_letter_t_black", "marking_letter_t_black");
    public static final Block FLOOR_MARKING_LETTER_U_BLACK = new MarkingFloor("floor_marking_letter_u_black", "marking_letter_u_black");
    public static final Block FLOOR_MARKING_LETTER_V_BLACK = new MarkingFloor("floor_marking_letter_v_black", "marking_letter_v_black");
    public static final Block FLOOR_MARKING_LETTER_W_BLACK = new MarkingFloor("floor_marking_letter_w_black", "marking_letter_w_black");
    public static final Block FLOOR_MARKING_LETTER_X_BLACK = new MarkingFloor("floor_marking_letter_x_black", "marking_letter_x_black");
    public static final Block FLOOR_MARKING_LETTER_Y_BLACK = new MarkingFloor("floor_marking_letter_y_black", "marking_letter_y_black");
    public static final Block FLOOR_MARKING_LETTER_Z_BLACK = new MarkingFloor("floor_marking_letter_z_black", "marking_letter_z_black");

    public static final Block FLOOR_MARKING_NUMBER_0_BLACK = new MarkingFloor("floor_marking_number_0_black", "marking_number_0_black");
    public static final Block FLOOR_MARKING_NUMBER_1_BLACK = new MarkingFloor("floor_marking_number_1_black", "marking_number_1_black");
    public static final Block FLOOR_MARKING_NUMBER_2_BLACK = new MarkingFloor("floor_marking_number_2_black", "marking_number_2_black");
    public static final Block FLOOR_MARKING_NUMBER_3_BLACK = new MarkingFloor("floor_marking_number_3_black", "marking_number_3_black");
    public static final Block FLOOR_MARKING_NUMBER_4_BLACK = new MarkingFloor("floor_marking_number_4_black", "marking_number_4_black");
    public static final Block FLOOR_MARKING_NUMBER_5_BLACK = new MarkingFloor("floor_marking_number_5_black", "marking_number_5_black");
    public static final Block FLOOR_MARKING_NUMBER_6_BLACK = new MarkingFloor("floor_marking_number_6_black", "marking_number_6_black");
    public static final Block FLOOR_MARKING_NUMBER_7_BLACK = new MarkingFloor("floor_marking_number_7_black", "marking_number_7_black");
    public static final Block FLOOR_MARKING_NUMBER_8_BLACK = new MarkingFloor("floor_marking_number_8_black", "marking_number_8_black");
    public static final Block FLOOR_MARKING_NUMBER_9_BLACK = new MarkingFloor("floor_marking_number_9_black", "marking_number_9_black");

    public static final Block WALL_MARKING_LETTER_A_BLACK = new MarkingWall("wall_marking_letter_a_black", "marking_letter_a_black");
    public static final Block WALL_MARKING_LETTER_B_BLACK = new MarkingWall("wall_marking_letter_b_black", "marking_letter_b_black");
    public static final Block WALL_MARKING_LETTER_C_BLACK = new MarkingWall("wall_marking_letter_c_black", "marking_letter_c_black");
    public static final Block WALL_MARKING_LETTER_D_BLACK = new MarkingWall("wall_marking_letter_d_black", "marking_letter_d_black");
    public static final Block WALL_MARKING_LETTER_E_BLACK = new MarkingWall("wall_marking_letter_e_black", "marking_letter_e_black");
    public static final Block WALL_MARKING_LETTER_F_BLACK = new MarkingWall("wall_marking_letter_f_black", "marking_letter_f_black");
    public static final Block WALL_MARKING_LETTER_G_BLACK = new MarkingWall("wall_marking_letter_g_black", "marking_letter_g_black");
    public static final Block WALL_MARKING_LETTER_H_BLACK = new MarkingWall("wall_marking_letter_h_black", "marking_letter_h_black");
    public static final Block WALL_MARKING_LETTER_I_BLACK = new MarkingWall("wall_marking_letter_i_black", "marking_letter_i_black");
    public static final Block WALL_MARKING_LETTER_J_BLACK = new MarkingWall("wall_marking_letter_j_black", "marking_letter_j_black");
    public static final Block WALL_MARKING_LETTER_K_BLACK = new MarkingWall("wall_marking_letter_k_black", "marking_letter_k_black");
    public static final Block WALL_MARKING_LETTER_L_BLACK = new MarkingWall("wall_marking_letter_l_black", "marking_letter_l_black");
    public static final Block WALL_MARKING_LETTER_M_BLACK = new MarkingWall("wall_marking_letter_m_black", "marking_letter_m_black");
    public static final Block WALL_MARKING_LETTER_N_BLACK = new MarkingWall("wall_marking_letter_n_black", "marking_letter_n_black");
    public static final Block WALL_MARKING_LETTER_O_BLACK = new MarkingWall("wall_marking_letter_o_black", "marking_letter_o_black");
    public static final Block WALL_MARKING_LETTER_P_BLACK = new MarkingWall("wall_marking_letter_p_black", "marking_letter_p_black");
    public static final Block WALL_MARKING_LETTER_Q_BLACK = new MarkingWall("wall_marking_letter_q_black", "marking_letter_q_black");
    public static final Block WALL_MARKING_LETTER_R_BLACK = new MarkingWall("wall_marking_letter_r_black", "marking_letter_r_black");
    public static final Block WALL_MARKING_LETTER_S_BLACK = new MarkingWall("wall_marking_letter_s_black", "marking_letter_s_black");
    public static final Block WALL_MARKING_LETTER_T_BLACK = new MarkingWall("wall_marking_letter_t_black", "marking_letter_t_black");
    public static final Block WALL_MARKING_LETTER_U_BLACK = new MarkingWall("wall_marking_letter_u_black", "marking_letter_u_black");
    public static final Block WALL_MARKING_LETTER_V_BLACK = new MarkingWall("wall_marking_letter_v_black", "marking_letter_v_black");
    public static final Block WALL_MARKING_LETTER_W_BLACK = new MarkingWall("wall_marking_letter_w_black", "marking_letter_w_black");
    public static final Block WALL_MARKING_LETTER_X_BLACK = new MarkingWall("wall_marking_letter_x_black", "marking_letter_x_black");
    public static final Block WALL_MARKING_LETTER_Y_BLACK = new MarkingWall("wall_marking_letter_y_black", "marking_letter_y_black");
    public static final Block WALL_MARKING_LETTER_Z_BLACK = new MarkingWall("wall_marking_letter_z_black", "marking_letter_z_black");

    public static final Block WALL_MARKING_NUMBER_0_BLACK = new MarkingWall("wall_marking_number_0_black", "marking_number_0_black");
    public static final Block WALL_MARKING_NUMBER_1_BLACK = new MarkingWall("wall_marking_number_1_black", "marking_number_1_black");
    public static final Block WALL_MARKING_NUMBER_2_BLACK = new MarkingWall("wall_marking_number_2_black", "marking_number_2_black");
    public static final Block WALL_MARKING_NUMBER_3_BLACK = new MarkingWall("wall_marking_number_3_black", "marking_number_3_black");
    public static final Block WALL_MARKING_NUMBER_4_BLACK = new MarkingWall("wall_marking_number_4_black", "marking_number_4_black");
    public static final Block WALL_MARKING_NUMBER_5_BLACK = new MarkingWall("wall_marking_number_5_black", "marking_number_5_black");
    public static final Block WALL_MARKING_NUMBER_6_BLACK = new MarkingWall("wall_marking_number_6_black", "marking_number_6_black");
    public static final Block WALL_MARKING_NUMBER_7_BLACK = new MarkingWall("wall_marking_number_7_black", "marking_number_7_black");
    public static final Block WALL_MARKING_NUMBER_8_BLACK = new MarkingWall("wall_marking_number_8_black", "marking_number_8_black");
    public static final Block WALL_MARKING_NUMBER_9_BLACK = new MarkingWall("wall_marking_number_9_black", "marking_number_9_black");

    public static final Block FLOOR_MARKING_NOSTEP_BLACK = new MarkingFloor("floor_marking_nostep_black", "marking_nostep_black");
    public static final Block FLOOR_MARKING_EXIT_BLACK = new MarkingFloor("floor_marking_exit_black", "marking_exit_black");

    public static final Block WALL_MARKING_EXIT_BLACK = new MarkingWall("wall_marking_exit_black", "marking_exit_black");
    public static final Block WALL_MARKING_UNIT_BLACK = new MarkingWall("wall_marking_unit_black", "marking_wall_unit_black");
    public static final Block WALL_MARKING_NUMBER_NO_BLACK = new MarkingWall("wall_marking_number_no_black", "marking_number_no_black");
    public static final Block WALL_MARKING_NUMBER_NUMERO_BLACK = new MarkingWall("wall_marking_number_numero_black", "marking_number_numero_black");
    public static final Block WALL_MARKING_NUMBER_DASH_BLACK = new MarkingWall("wall_marking_number_dash_black", "marking_number_dash_black");
    public static final Block WALL_MARKING_NUMBER_COMMA_BLACK = new MarkingWall("wall_marking_number_comma_black", "marking_number_comma_black");
    public static final Block WALL_MARKING_NUMBER_PERIOD_BLACK = new MarkingWall("wall_marking_number_period_black", "marking_number_period_black");
    public static final Block WALL_MARKING_SYMBOL_CHEMICAL_BLACK = new MarkingWall("wall_marking_symbol_chemical_black", "marking_wall_symbol_chemical_black");
    public static final Block WALL_MARKING_SYMBOL_ELECTRIC_BLACK = new MarkingWall("wall_marking_symbol_electric_black", "marking_wall_symbol_electric_black");
    public static final Block WALL_MARKING_SYMBOL_FIRE_BLACK = new MarkingWall("wall_marking_symbol_fire_black", "marking_wall_symbol_fire_black");
    public static final Block WALL_MARKING_SYMBOL_FLUID_BLACK = new MarkingWall("wall_marking_symbol_fluid_black", "marking_wall_symbol_fluid_black");
    public static final Block WALL_MARKING_SYMBOL_FROST_BLACK = new MarkingWall("wall_marking_symbol_frost_black", "marking_wall_symbol_frost_black");
    public static final Block WALL_MARKING_SYMBOL_GEARS_BLACK = new MarkingWall("wall_marking_symbol_gears_black", "marking_wall_symbol_gears_black");
    public static final Block WALL_MARKING_SYMBOL_LASER_BLACK = new MarkingWall("wall_marking_symbol_laser_black", "marking_wall_symbol_laser_black");
    public static final Block WALL_MARKING_SYMBOL_MAGIC_BLACK = new MarkingWall("wall_marking_symbol_magic_black", "marking_wall_symbol_magic_black");
    public static final Block WALL_MARKING_SYMBOL_MOB_BLACK = new MarkingWall("wall_marking_symbol_mob_black", "marking_wall_symbol_mob_black");
    public static final Block WALL_MARKING_SYMBOL_PINCH_BLACK = new MarkingWall("wall_marking_symbol_pinch_black", "marking_wall_symbol_pinch_black");
    public static final Block WALL_MARKING_SYMBOL_PRODUCTION_BLACK = new MarkingWall("wall_marking_symbol_production_black", "marking_wall_symbol_production_black");
    public static final Block WALL_MARKING_SYMBOL_RADIATION_BLACK = new MarkingWall("wall_marking_symbol_radiation_black", "marking_wall_symbol_radiation_black");
    public static final Block WALL_MARKING_SYMBOL_STORAGE_BLACK = new MarkingWall("wall_marking_symbol_storage_black", "marking_wall_symbol_storage_black");

    public static final Block WALL_MARKING_EXCLAMATION_MARK = new MarkingWall("wall_marking_exclamation_mark", "marking_wall_exclamation_mark");
    public static final Block WALL_MARKING_QUESTION_MARK = new MarkingWall("wall_marking_question_mark", "marking_wall_question_mark");
    public static final Block WALL_MARKING_EXCLAMATION_MARK_BLACK = new MarkingWall("wall_marking_exclamation_mark_black", "marking_wall_exclamation_mark_black");
    public static final Block WALL_MARKING_QUESTION_MARK_BLACK = new MarkingWall("wall_marking_question_mark_black", "marking_wall_question_mark_black");
    public static final Block WALL_MARKING_CORROSIVE = new MarkingWall("wall_marking_corrosive", "marking_corrosive");
    public static final Block WALL_MARKING_HEALTH_HAZARD = new MarkingWall("wall_marking_health_hazard", "marking_health_hazard");
    public static final Block WALL_MARKING_SKULL_CROSSBONES = new MarkingWall("wall_marking_skull_crossbones", "marking_skull_crossbones");
    public static final Block WALL_MARKING_WARNING = new MarkingWall("wall_marking_warning", "marking_warning");
    public static final Block WALL_MARKING_PPE_BOOTS = new MarkingWall("wall_marking_ppe_boots", "marking_ppe_boots");
    public static final Block WALL_MARKING_PPE_GLASSES = new MarkingWall("wall_marking_ppe_glasses", "marking_ppe_glasses");
    public static final Block WALL_MARKING_PPE_HIGHVIS = new MarkingWall("wall_marking_ppe_highvis", "marking_ppe_highvis");
    public static final Block WALL_MARKING_PPE_MASK = new MarkingWall("wall_marking_ppe_mask", "marking_ppe_mask");
    public static final Block WALL_MARKING_PPE_SUIT = new MarkingWall("wall_marking_ppe_suit", "marking_ppe_suit");
    public static final Block WALL_MARKING_NO_SAFETY = new MarkingWall("wall_marking_no_safety", "marking_no_safety");
    public static final Block WALL_MARKING_SMOKING_FIRST = new MarkingWall("wall_marking_smoking_first", "marking_smoking_first");

    public static final Block WALL_MARKING_HAZARD_BARBEDWIRE = new MarkingWall("wall_marking_hazard_barbedwire", "marking_hazard_barbedwire");
    public static final Block WALL_MARKING_HAZARD_HIGHWATER = new MarkingWall("wall_marking_hazard_highwater", "marking_hazard_highwater");
    public static final Block WALL_MARKING_HAZARD_WITHER = new MarkingWall("wall_marking_hazard_wither", "marking_hazard_wither");
    public static final Block WALL_MARKING_HAZARD_BATTERY = new MarkingWall("wall_marking_hazard_battery", "marking_hazard_battery");
    public static final Block WALL_MARKING_HAZARD_HOTSURFACE = new MarkingWall("wall_marking_hazard_hotsurface", "marking_hazard_hotsurface");
    public static final Block WALL_MARKING_PPE_EARPROT = new MarkingWall("wall_marking_ppe_earprot", "marking_ppe_earprot");
    public static final Block WALL_MARKING_HAZARD_COLD = new MarkingWall("wall_marking_hazard_cold", "marking_hazard_cold");
    public static final Block WALL_MARKING_HAZARD_IRRITANT = new MarkingWall("wall_marking_hazard_irritant", "marking_hazard_irritant");
    public static final Block WALL_MARKING_PRESCRIPTION_TURNOFF = new MarkingWall("wall_marking_prescription_turnoff", "marking_prescription_turnoff");
    public static final Block WALL_MARKING_HAZARD_CRUSHING = new MarkingWall("wall_marking_hazard_crushing", "marking_hazard_crushing");
    public static final Block WALL_MARKING_HAZARD_LASER = new MarkingWall("wall_marking_hazard_laser", "marking_hazard_laser");
    public static final Block WALL_MARKING_SAFETY_ASSEMBLY = new MarkingWall("wall_marking_safety_assembly", "marking_safety_assembly");
    public static final Block WALL_MARKING_HAZARD_EXPLOSIVEATHMOSPHERE = new MarkingWall("wall_marking_hazard_explosiveathmosphere", "marking_hazard_explosiveathmosphere");
    public static final Block WALL_MARKING_HAZARD_MAGNETIC = new MarkingWall("wall_marking_hazard_magnetic", "marking_hazard_magnetic");
    public static final Block WALL_MARKING_SAFETY_DEFIBRILLATOR = new MarkingWall("wall_marking_safety_defibrillator", "marking_safety_defibrillator");
    public static final Block WALL_MARKING_HAZARD_FALLING = new MarkingWall("wall_marking_hazard_falling", "marking_hazard_falling");
    public static final Block WALL_MARKING_HAZARD_MOBFARM = new MarkingWall("wall_marking_hazard_mobfarm", "marking_hazard_mobfarm");
    public static final Block WALL_MARKING_SAFETY_EMERGENCYSTOP = new MarkingWall("wall_marking_safety_emergencystop", "marking_safety_emergencystop");
    public static final Block WALL_MARKING_HAZARD_FALLINGDEBRIS = new MarkingWall("wall_marking_hazard_fallingdebris", "marking_hazard_fallingdebris");
    public static final Block WALL_MARKING_HAZARD_NOISE = new MarkingWall("wall_marking_hazard_noise", "marking_hazard_noise");
    public static final Block WALL_MARKING_SAFETY_HEALTH = new MarkingWall("wall_marking_safety_health", "marking_safety_health");
    public static final Block WALL_MARKING_HAZARD_FLUXRIFT = new MarkingWall("wall_marking_hazard_fluxrift", "marking_hazard_fluxrift");
    public static final Block WALL_MARKING_HAZARD_RADIATION = new MarkingWall("wall_marking_hazard_radiation", "marking_hazard_radiation");
    public static final Block WALL_MARKING_SAFETY_LADDER = new MarkingWall("wall_marking_safety_ladder", "marking_safety_ladder");
    public static final Block WALL_MARKING_HAZARD_GROUND = new MarkingWall("wall_marking_hazard_ground", "marking_hazard_ground");
    public static final Block WALL_MARKING_HAZARD_RADIOWAVES = new MarkingWall("wall_marking_hazard_radiowaves", "marking_hazard_radiowaves");
    public static final Block WALL_MARKING_SAFETY_O2 = new MarkingWall("wall_marking_safety_o2", "marking_safety_o2");
    public static final Block WALL_MARKING_HAZARD_HIGHPRESSURE = new MarkingWall("wall_marking_hazard_highpressure", "marking_hazard_highpressure");
    public static final Block WALL_MARKING_HAZARD_SPAWNER = new MarkingWall("wall_marking_hazard_spawner", "marking_hazard_spawner");
    public static final Block WALL_MARKING_SAFETY_SHOWER = new MarkingWall("wall_marking_safety_shower", "marking_safety_shower");
    public static final Block WALL_MARKING_HAZARD_HIGHTEMP = new MarkingWall("wall_marking_hazard_hightemp", "marking_hazard_hightemp");
    public static final Block WALL_MARKING_HAZARD_VIDEOCAMERA = new MarkingWall("wall_marking_hazard_videocamera", "marking_hazard_videocamera");
    public static final Block WALL_MARKING_EXIT_GREEN = new MarkingWall("wall_marking_exit_green", "marking_wall_exit_green");

    public static final Block WALL_MARKING_FLAG_GTNH = new MarkingWall("wall_marking_flag_gtnh", "marking_flag_GTNH");
    public static final Block FLOOR_MARKING_YELLOW_CORNER = new MarkingFloor("floor_marking_yellow_corner", "marking_yellow_corner");
    public static final Block FLOOR_MARKING_WHITE_CORNER = new MarkingFloor("floor_marking_white_corner", "marking_white_corner");
    public static final Block FLOOR_MARKING_BLACK_CORNER = new MarkingFloor("floor_marking_black_corner", "marking_black_corner");
    public static final Block FLOOR_MARKING_GREEN_CORNER = new MarkingFloor("floor_marking_green_corner", "marking_green_corner");
    public static final Block FLOOR_MARKING_BLUE_CORNER = new MarkingFloor("floor_marking_blue_corner", "marking_blue_corner");
    public static final Block FLOOR_MARKING_RED_CORNER = new MarkingFloor("floor_marking_red_corner", "marking_red_corner");
    public static final Block FLOOR_MARKING_ORANGE_CORNER = new MarkingFloor("floor_marking_orange_corner", "marking_orange_corner");
    // +++=====SEMIOTICS=====++
    // Where a name id already exists, I append semiotic to the end of the IDs
    public static final Block WALL_MARKING_AIRLOCK = new MarkingWall("wall_marking_airlock", "marking_wall_airlock");
    public static final Block WALL_MARKING_ARROWDOWN_SEMIOTIC = new MarkingWall("wall_marking_arrowdown_semiotic", "marking_wall_arrowdown_semiotic");
    public static final Block WALL_MARKING_ARROWLEFT_SEMIOTIC = new MarkingWall("wall_marking_arrowleft_semiotic", "marking_wall_arrowleft_semiotic");
    public static final Block WALL_MARKING_ARROWRIGHT_SEMIOTIC = new MarkingWall("wall_marking_arrowright_semiotic", "marking_wall_arrowright_semiotic");
    public static final Block WALL_MARKING_ARROWUP_SEMIOTIC = new MarkingWall("wall_marking_arrowup_semiotic", "marking_wall_arrowup_semiotic");
    public static final Block WALL_MARKING_AUTODOC = new MarkingWall("wall_marking_autodoc", "marking_wall_autodoc");
    public static final Block WALL_MARKING_BRIDGE = new MarkingWall("wall_marking_bridge", "marking_wall_bridge");
    public static final Block WALL_MARKING_BULKHEAD = new MarkingWall("wall_marking_bulkhead", "marking_wall_bulkhead");
    public static final Block WALL_MARKING_COFFEE = new MarkingWall("wall_marking_coffee", "marking_wall_coffee");
    public static final Block WALL_MARKING_CRYOGENICS = new MarkingWall("wall_marking_cryogenics", "marking_wall_cryogenics");
    public static final Block WALL_MARKING_ELECTRONICS = new MarkingWall("wall_marking_electronics", "marking_wall_electronics");
    public static final Block WALL_MARKING_EXHAUST = new MarkingWall("wall_marking_exhaust", "marking_wall_exhaust");
    public static final Block WALL_MARKING_HAZARD_WARNING = new MarkingWall("wall_marking_hazard_warning", "marking_wall_hazard_warning");
    public static final Block WALL_MARKING_HAZARD_RADIATION_SEMIOTIC = new MarkingWall("wall_marking_hazard_radiation_semiotic", "marking_wall_hazard_radiation_semiotic");
    public static final Block WALL_MARKING_INTERCOM = new MarkingWall("wall_marking_intercom", "marking_wall_intercom");
    public static final Block WALL_MARKING_LADDERWAY = new MarkingWall("wall_marking_ladderway", "marking_wall_ladderway");
    public static final Block WALL_MARKING_LASER = new MarkingWall("wall_marking_laser", "marking_wall_laser");
    public static final Block WALL_MARKING_LIFE_SUPPORT = new MarkingWall("wall_marking_life_support", "marking_wall_life_support");
    public static final Block WALL_MARKING_LIFE_SUPPORT_MEDICAL = new MarkingWall("wall_marking_life_support_medical", "marking_wall_life_support_medical");
    public static final Block WALL_MAINTENANCE = new MarkingWall("wall_marking_maintenance", "marking_wall_maintenance");
    public static final Block WALL_MARKING_MEDICAL = new MarkingWall("wall_marking_medical", "marking_wall_medical");
    public static final Block WALL_MARKING_NO_AIR = new MarkingWall("wall_marking_no_air", "marking_wall_no_air");
    public static final Block WALL_MARKING_NO_AIR_ART_GRAV = new MarkingWall("wall_marking_no_air_art_grav", "marking_wall_no_air_art_grav");
    public static final Block WALL_MARKING_NO_AIR_NO_GRAVITY = new MarkingWall("wall_marking_no_air_no_gravity", "marking_wall_no_air_no_gravity");
    public static final Block WALL_PHOTONICS = new MarkingWall("wall_marking_photonics", "marking_wall_photonics");
    public static final Block WALL_MARKING_PRESSURE_SUIT_LOCKER = new MarkingWall("wall_marking_pressure_suit_locker", "marking_wall_pressure_suit_locker");
    public static final Block WALL_MARKING_PRESSURIZED_AREA = new MarkingWall("wall_marking_pressurized_area", "marking_wall_pressurized_area");
    public static final Block WALL_MARKING_PRESSURIZED_AREA_ART_GRAVITY = new MarkingWall("wall_marking_pressurized_area_art_gravity", "marking_wall_pressurized_area_art_gravity");
    public static final Block WALL_MARKING_PRESSURIZED_AREA_NO_GRAV = new MarkingWall("wall_marking_pressurized_area_no_grav", "marking_wall_pressurized_area_no_grav");
    public static final Block WALL_MARKING_RADIATION = new MarkingWall("wall_marking_radiation", "marking_wall_radiation");
    public static final Block WALL_MARKING_RADIATION_SHIELDED_AREA = new MarkingWall("wall_marking_radiation_shielded_area", "marking_wall_radiation_shielded_area");
    public static final Block WALL_MARKING_STORAGE = new MarkingWall("wall_marking_storage", "marking_wall_storage");
    public static final Block WALL_MARKING_STORAGE_REFRIGERATION = new MarkingWall("wall_marking_storage_refrigeration", "marking_wall_storage_refrigeration");
    public static final Block WALL_MARKING_STORAGE_FOODSTUFFS = new MarkingWall("wall_marking_storage_foodstuffs", "marking_wall_storage_foodstuffs");
    public static final Block WALL_MARKING_STORAGE_FOODSTUFFS_FRIDGE = new MarkingWall("wall_marking_storage_foodstuffs_fridge", "marking_wall_storage_foodstuffs_fridge");
    public static final Block WALL_MARKING_TERMINAL = new MarkingWall("wall_marking_terminal", "marking_wall_terminal");

    public static final Block FLOOR_MARKING_BLACK_T_CROSSING = new MarkingFloor("floor_marking_black_t_crossing", "marking_black_t_crossing");
    public static final Block FLOOR_MARKING_BLACK_CROSSING = new MarkingFloor("floor_marking_black_crossing", "marking_black_crossing");
    public static final Block FLOOR_MARKING_BLACK_TURN = new MarkingFloor("floor_marking_black_turn", "marking_black_turn");
    public static final Block FLOOR_MARKING_BLACK_END = new MarkingFloor("floor_marking_black_end", "marking_black_end");
    public static final Block FLOOR_MARKING_BLACK_SIDELINE = new MarkingFloor("floor_marking_black_sideline", "marking_black_sideline");
    public static final Block FLOOR_MARKING_BLACK_SQUARE = new MarkingFloor("floor_marking_black_square", "marking_black_square");
    public static final Block FLOOR_MARKING_YELLOW_LANE_CROSS = new MarkingFloor("floor_marking_yellow_lane_cross", "marking_yellow_lane_cross");
    
    public static final Block FLOOR_MARKING_WHITE_DOUBLE_ARROW = new MarkingFloor("floor_marking_white_double_arrow", "marking_white_double_arrow");
    public static final Block WALL_MARKING_WHITE_DOUBLE_ARROW = new MarkingWall("wall_marking_white_double_arrow", "marking_white_double_arrow");
    // spotless:on

    public static void registerBlocks() {
        for (Block block : BLOCKS) {
            GameRegistry.registerBlock(block, block.getUnlocalizedName());
        }
    }

}
